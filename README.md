AWS Pen Test Form
=================

This project is a tool to help automate filling in the
[AWS penetration testing form](https://portal.aws.amazon.com/gp/aws/html-forms-controller/contactus/AWSSecurityPenTestRequest).

Before commencing penetration testing on assets in AWS, the form must
be completed to request permission from Amazon. In the modern world of
autoscaled instances the form appears, at first glance, to be fairly
unhelpful. In these cases Amazon recommend listing all current
instances as normal, btu adding a section in the comments that
describes each autoscaling group and the instances current;y running
therein. This helps them to apply the permission to the AS groups
rather than to specific instances.

Filling in the form properly is a very tedious process, but luckily
it's very easy to generate the information using the AWS SDK.

## Usage

Included in this project is a jar that can be executed directly.

    java -jar pen-test-form.jar <AWS profile> [<aws region name>]

e.g.

    java -jar pen-test-form.jar my-profile eu-west-1

The project uses the AWS credentials file so you should provide a
profile to choose which account to use (just as you would when using
the AWS CLI tool). More info is available in the
[AWS CLI documentation](http://docs.aws.amazon.com/cli/latest/userguide/cli-chap-getting-started.html).

The second argument is the AWS region to use when checking for AS
groups and instances. This defaults to eu-west-1 for our (The
Guardian's) convenience.

## Output

The tool will output the details as text that you can copy into the
pen test form. It will look a little like the following:

    Instance IDs:
    i-21fedcba
    i-abcdef12
    
    Instance IPs:
    1.1.1.1
    1.1.1.2
    
    Comments:
    Here are full details of the AS groups and current instances. The actual instances will change during routine scaling and deployments.
    
    janus-AutoscalingGroup-1IJMYNGI5LW37
    1.1.1.1	i-21fedcba (t2.medium)
    1.1.1.2	i-abcdef12 (t2.medium)

These are the three form fields that are tedious to fill in. You'll
still need to get the details for the other fields.

## Development / alternate usage

You can also check out the project and run it directly using
`sbt`. Open a command line from within the project and execute the
following:

    ./sbt "run <AWS profile> [<aws region name>]"

This will fetch all the dependencies, compile the project and execute
it the same way as running the jar directly would.

### Building

You can build your own jar by running the `assembly` command.

    ./sbt assembly

This will run the tests and then create a "fat jar" containing all the
project's dependencies. You'll see the location the jar gets saved to
near the bottom of that command's output.

    [info] Packaging <path to jar>/pen-test-form.jar ...
    [info] Done packaging.

