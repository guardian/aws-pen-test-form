# Changelog

## v1.2 Use private IPs and warn about excluded instances

We now use private IP addresses for instances that do nto havea public
IP address attached.

This also includes an update to the unsupported instances
behaviour. We now exclude the new t2.nano type and display an error
describing which (if any) instances have been excluded from the
pen-test request. This

## v1.1 Exclude unsupported instance types

As mentioned on
[the AWS information page](http://aws.amazon.com/security/penetration-testing/),
certain instance types are not supported for penetration testing. We
now exclude these instances from the information produced by this
tool.

## v1.0 Initial release
