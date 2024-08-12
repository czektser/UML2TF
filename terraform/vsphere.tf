provider "vsphere" {
  user           = "your-vsphere-user"
  password       = "your-vsphere-password"
  vsphere_server = "your-vsphere-server"

  allow_unverified_ssl = true
}

# --------- vSphere VM ---------

# Data for vSphere VM (Replace with your own values)
data "vsphere_datacenter" "dc" {
  name = "your-datacenter-name"
}

data "vsphere_datastore" "datastore" {
  name          = "your-datastore-name"
  datacenter_id = data.vsphere_datacenter.dc.id
}

data "vsphere_compute_cluster" "cluster" {
  name          = "your-cluster-name"
  datacenter_id = data.vsphere_datacenter.dc.id
}

data "vsphere_virtual_machine" "template" {
  name          = "your-template-name"  # Replace with your VM template name
  datacenter_id = data.vsphere_datacenter.dc.id
}

resource "vsphere_virtual_machine" "vm" {
  name             = "my-vsphere-vm"
  resource_pool_id = data.vsphere_compute_cluster.cluster.resource_pool_id
  datastore_id     = data.vsphere_datastore.datastore.id

  num_cpus = 2
  memory   = 4096

  network_interface {
    network_id   = "your-network-id"
    adapter_type = "vmxnet3"
  }

  disk {
    label            = "disk0"
    size             = 20
    eagerly_scrub    = false
    thin_provisioned = true
  }

  guest_id = data.vsphere_virtual_machine.template.guest_id

  clone {
    template_uuid = data.vsphere_virtual_machine.template.id
  }

  # Set cloud-init to handle user-data (For Linux VMs)
  extra_config = {
    "guestinfo.userdata"    = base64encode(file("cloud-init.yaml"))
    "guestinfo.userdata.encoding" = "base64"
  }

  # Attach to an existing security group or open firewall for S3 and Blob
  depends_on = [azurerm_storage_account.storage, aws_s3_bucket.s3_bucket]
}

resource "azurerm_role_assignment" "ad_user_vm_access" {
  principal_id           = "your-azure-ad-user-id"
  role_definition_name   = "Virtual Machine Contributor"
  scope                  = vsphere_virtual_machine.vm.id
}

# Allow the vSphere VM to access the S3 bucket using a pre-existing IAM role (assuming the VM runs a Linux OS and can use AWS CLI)
resource "aws_iam_role_policy" "vm_s3_access" {
  name   = "vm_s3_access"
  role   = "your-existing-iam-role-name"  # Replace with the IAM role attached to the VM
  policy = data.aws_iam_policy_document.s3_access_policy.json
}
# Allow vSphere VM to access the Azure Blob store
resource "azurerm_role_assignment" "vm_blob_access" {
  principal_id           = vsphere_virtual_machine.vm.id  # VM's managed identity ID
  role_definition_name   = "Storage Blob Data Contributor"
  scope                  = azurerm_storage_account.storage.id
}

resource "null_resource" "vsphere_user" {
  provisioner "local-exec" {
    command = <<EOT
    ssh root@${vsphere_virtual_machine.vm.ip_address} 'esxcli system account add --id=${var.vsphere_user} --password=${var.vsphere_user_password} --description="AWS IAM User"'
    ssh root@${vsphere_virtual_machine.vm.ip_address} 'esxcli system permission set --id=${var.vsphere_user} --role=Admin'
    EOT
  }
}

variable "vsphere_user" {
  description = "The vSphere username for AWS IAM user"
  type        = string
  default     = "awsuser"
}

variable "vsphere_user_password" {
  description = "The vSphere password for AWS IAM user"
  type        = string
  sensitive   = true
  default     = "SecureP@ssw0rd"
}
