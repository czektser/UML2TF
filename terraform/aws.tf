provider "aws" {
  region = "us-west-2" # Change this to your preferred region
}

# Create an S3 bucket
resource "aws_s3_bucket" "my_bucket" {
  bucket = "my-unique-bucket-name-123456" # Change this to a unique bucket name
}

# Create an EC2 instance
resource "aws_instance" "my_instance" {
  ami           = "ami-0c55b159cbfafe1f0" # Replace with your preferred AMI
  instance_type = "t2.micro"              # Change instance type if needed

  iam_instance_profile = aws_iam_instance_profile.ec2_profile.name

  tags = {
    Name = "MyEC2Instance"
  }
}

# Create an IAM user
resource "aws_iam_user" "my_user" {
  name = "my_user"
}

# Attach policies to allow full access to S3 and EC2
resource "aws_iam_user_policy" "s3_and_ec2_policy" {
  name   = "s3_and_ec2_policy"
  user   = aws_iam_user.my_user.name
  policy = data.aws_iam_policy_document.s3_and_ec2_policy.json
}

data "aws_iam_policy_document" "s3_and_ec2_policy" {
  statement {
    actions   = ["ec2:*", "s3:*"]
    resources = ["*"]
  }
}

# Create an IAM role for EC2
resource "aws_iam_role" "ec2_role" {
  name = "ec2_role"

  assume_role_policy = data.aws_iam_policy_document.ec2_assume_role_policy.json
}

data "aws_iam_policy_document" "ec2_assume_role_policy" {
  statement {
    actions = ["sts:AssumeRole"]
    principals {
      type        = "Service"
      identifiers = ["ec2.amazonaws.com"]
    }
  }
}

# Attach a policy to allow the EC2 instance to access S3
resource "aws_iam_role_policy" "s3_access_policy" {
  name   = "s3_access_policy"
  role   = aws_iam_role.ec2_role.name
  policy = data.aws_iam_policy_document.s3_access_policy.json
}

data "aws_iam_policy_document" "s3_access_policy" {
  statement {
    actions   = ["s3:*"]
    resources = ["*"]
  }
}

# Create an IAM instance profile to attach the IAM role to the EC2 instance
resource "aws_iam_instance_profile" "ec2_profile" {
  name = "ec2_profile"
  role = aws_iam_role.ec2_role.name
}
