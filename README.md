# AWS Lambda Kotlin Spring boot2 Demo

This demo referred https://github.com/awslabs/aws-serverless-java-container/tree/main/samples/springboot2/pet-store  

## Pre-requisites

- AWS CLI
- SAM CLI
- Gradle or Maven

## Deployment

In a shell, navigate to the sample's folder and use the SAM CLI to build a deployable package
```
$ sam build
```

This command compiles the application and prepares a deployment package in the `.aws-sam` sub-directory.

To deploy the application in your AWS account, you can use the SAM CLI's guided deployment process and follow the instructions on the screen

```
$ sam deploy --guided
```

```
Configuring SAM deploy
======================

        Looking for config file [samconfig.toml] :  Not found

        Setting default arguments for 'sam deploy'
        =========================================
        Stack Name [sam-app]: spring-boot2-demo-api
        AWS Region [ap-northeast-2]: 
        #Shows you resources changes to be deployed and require a 'Y' to initiate deploy
        Confirm changes before deploy [y/N]: y
        #SAM needs permission to be able to create roles to connect to the resources in your template
        Allow SAM CLI IAM role creation [Y/n]: 
        #Preserves the state of previously provisioned resources when an operation fails
        Disable rollback [y/N]: 
        DemoFunction may not have authorization defined, Is this okay? [y/N]: y
        Save arguments to configuration file [Y/n]: 
        SAM configuration file [samconfig.toml]: 
        SAM configuration environment [default]:
...
...
...
Deploy this changeset? [y/N]: y
...
...
...
```

Once the deployment is completed, the SAM CLI will print out the stack's outputs, including the new application URL. You can use `curl` or a web browser to make a call to the URL

```
...
---------------------------------------------------------------------------------------------------------
OutputKey-Description                        OutputValue
---------------------------------------------------------------------------------------------------------
SpringBoot2DemoApi - URL for application            https://xxxxxxxxxx.execute-api.ap-northeast-2.amazonaws.com/demo
---------------------------------------------------------------------------------------------------------

$ curl https://xxxxxxxxxx.execute-api.ap-northeast-2.amazonaws.com/demo
```

## Lambda Warmer with EventBridge

- EventBridge > ????????? > ?????? > ?????? ??????

## Route53 ????????? ??????

- API Gateway > ????????? ?????? ????????? ?????? > ?????? > ?????? > API ??????
- Route53 > ????????? ?????? > {?????????} > ????????? ?????? > ?????? > API Gateway API??? ?????? ?????? > ?????? ?????? > ??????????????? ??????
