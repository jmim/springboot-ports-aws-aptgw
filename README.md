# Requirements
aws - account
aws-cli, kubectl, helm on local machine

# Installing infra

Init and apply terraform. main.tf terraform for eks + api gateway

check if kubectl get svc works

## install ingress controller
helm repo add ingress-nginx https://kubernetes.github.io/ingress-nginx
helm repo update
helm install ingress-nginx ingress-nginx/ingress-nginx --set controller.publishService.enabled=true

## key generation
keytool -genkeypair -alias mykey -keyalg RSA -keystore mykeystore.p12 -storetype PKCS12 -validity 365 -keysize 2048

### creating secret on eks
kubectl create secret generic my-keystore-secret --from-file=mykeystore.p12


# Getting Started

8000 port for http, 8081 port for https

kubectl has 

key generation
keytool -genkeypair -alias mykey -keyalg RSA -keystore mykeystore.p12 -storetype PKCS12 -validity 365 -keysize 2048

creating secret 
kubectl create secret generic my-keystore-secret --from-file=mykeystore.p12



### Reference Documentation

For further reference, please consider the following sections:

* [Official Gradle documentation](https://docs.gradle.org)
* [Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.3.0/gradle-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.3.0/gradle-plugin/reference/html/#build-image)
* [Spring Configuration Processor](https://docs.spring.io/spring-boot/docs/3.3.0/reference/htmlsingle/index.html#appendix.configuration-metadata.annotation-processor)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/3.3.0/reference/htmlsingle/index.html#using.devtools)

### Additional Links

These additional references should also help you:

* [Gradle Build Scans – insights for your project's build](https://scans.gradle.com#gradle)

