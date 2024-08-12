provider "azurerm" {
  features = {}
}

provider "aws" {
  region = "us-west-2" # Change this to your preferred region for S3
}

# Create an Azure AD user
resource "azuread_user" "ad_user" {
  user_principal_name = "myuser@yourdomain.onmicrosoft.com"  # Replace with your domain
  display_name        = "My User"
  password            = "P@ssw0rd!"  # Replace with a secure password
}

# Create a Resource Group
resource "azurerm_resource_group" "rg" {
  name     = "myResourceGroup"
  location = "West Europe"  # Change to your preferred Azure region
}

# Create a Storage Account (Blob store)
resource "azurerm_storage_account" "storage" {
  name                     = "mystorageaccount123"  # Must be globally unique
  resource_group_name      = azurerm_resource_group.rg.name
  location                 = azurerm_resource_group.rg.location
  account_tier             = "Standard"
  account_replication_type = "LRS"
}

# Create a Container in the Storage Account
resource "azurerm_storage_container" "storage_container" {
  name                  = "mycontainer"
  storage_account_name  = azurerm_storage_account.storage.name
  container_access_type = "private"
}

# Create a Virtual Network
resource "azurerm_virtual_network" "vnet" {
  name                = "myVnet"
  address_space       = ["10.0.0.0/16"]
  location            = azurerm_resource_group.rg.location
  resource_group_name = azurerm_resource_group.rg.name
}

# Create a Subnet
resource "azurerm_subnet" "subnet" {
  name                 = "mySubnet"
  resource_group_name  = azurerm_resource_group.rg.name
  virtual_network_name = azurerm_virtual_network.vnet.name
  address_prefixes     = ["10.0.1.0/24"]
}

# Create a Network Interface
resource "azurerm_network_interface" "nic" {
  name                = "myNIC"
  location            = azurerm_resource_group.rg.location
  resource_group_name = azurerm_resource_group.rg.name

  ip_configuration {
    name                          = "internal"
    subnet_id                     = azurerm_subnet.subnet.id
    private_ip_address_allocation = "Dynamic"
  }
}

# Create a Public IP
resource "azurerm_public_ip" "public_ip" {
  name                = "myPublicIP"
  location            = azurerm_resource_group.rg.location
  resource_group_name = azurerm_resource_group.rg.name
  allocation_method   = "Dynamic"
}

# Create a Managed Identity
resource "azurerm_user_assigned_identity" "identity" {
  name                = "myIdentity"
  location            = azurerm_resource_group.rg.location
  resource_group_name = azurerm_resource_group.rg.name
}

# Create a Virtual Machine
resource "azurerm_linux_virtual_machine" "vm" {
  name                = "myVM"
  resource_group_name = azurerm_resource_group.rg.name
  location            = azurerm_resource_group.rg.location
  size                = "Standard_B1ms"
  admin_username      = "adminuser"
  network_interface_ids = [
    azurerm_network_interface.nic.id,
  ]

  admin_ssh_key {
    username   = "adminuser"
    public_key = file("~/.ssh/id_rsa.pub")  # Update with the path to your public SSH key
  }

  os_disk {
    caching              = "ReadWrite"
    storage_account_type = "Standard_LRS"
  }

  source_image_reference {
    publisher = "Canonical"
    offer     = "UbuntuServer"
    sku       = "18.04-LTS"
    version   = "latest"
  }

  identity {
    type         = "UserAssigned"
    identity_ids = [azurerm_user_assigned_identity.identity.id]
  }
}

# Assign Role to the Managed Identity to Access Blob Store
resource "azurerm_role_assignment" "blob_access" {
  principal_id   = azurerm_user_assigned_identity.identity.principal_id
  role_definition_name = "Storage Blob Data Contributor"
  scope          = azurerm_storage_account.storage.id
}

# Assign Role to the Azure AD User to Access the VM
resource "azurerm_role_assignment" "vm_access" {
  principal_id   = azuread_user.ad_user.object_id
  role_definition_name = "Virtual Machine Contributor"
  scope          = azurerm_linux_virtual_machine.vm.id
}

# Assign Role to the Azure AD User to Access the Blob Store
resource "azurerm_role_assignment" "user_blob_access" {
  principal_id   = azuread_user.ad_user.object_id
  role_definition_name = "Storage Blob Data Contributor"
  scope          = azurerm_storage_account.storage.id
}

# Allow the VM to access the S3 bucket using IAM roles and policies (Assuming IAM roles are pre-configured)
data "aws_iam_policy_document" "s3_access_policy" {
  statement {
    actions   = ["s3:*"]
    resources = ["arn:aws:s3:::my-s3-bucket/*"]  # Replace with your S3 bucket ARN
  }
}

resource "aws_iam_role_policy" "vm_s3_access" {
  name   = "vm_s3_access"
  role   = "<your-existing-iam-role-name>"  # Replace with the IAM role attached to the VM
  policy = data.aws_iam_policy_document.s3_access_policy.json
}
