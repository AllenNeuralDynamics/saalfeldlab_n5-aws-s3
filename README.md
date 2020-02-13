# N5 AWS S3 [![Build Status](https://travis-ci.org/saalfeldlab/n5-aws-s3.svg?branch=master)](https://travis-ci.org/saalfeldlab/n5-aws-s3)
N5 library implementation using Amazon Web Services S3 backend.

N5 containers can be represented by either an S3 bucket, or a directory tree inside a bucket (new in version **3.0.0**).

### Authentication

Access to non-public buckets requires a few steps to set up the security credentials:

1. Create access keys in the [AWS console](https://console.aws.amazon.com/iam/home?#/security_credential).
1. Configure them on your machine using the credentials profile:
    * Install [AWS Command Line Interface](https://aws.amazon.com/cli/).
    * Run `aws configure` and enter your access key ID, secret key, and geographical region as described [here](https://docs.aws.amazon.com/cli/latest/userguide/cli-chap-getting-started.html#cli-quick-configuration).
