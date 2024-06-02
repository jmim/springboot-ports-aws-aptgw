# Requirements

Kubernetes on AWS or local minikube. Nginx-Ingress-Controller.


# key generation
```
keytool -genkeypair -alias mykey -keyalg RSA -keystore mykeystore.p12 -storetype PKCS12 -validity 365 -keysize 2048
```
# creating secret
```
kubectl create secret generic my-keystore-secret --from-file=mykeystore.p12
```



## key generation
```
keytool -genkeypair -alias mykey -keyalg RSA -keystore mykeystore.p12 -storetype PKCS12 -validity 365 -keysize 2048
```
### creating secret on eks
```
kubectl create secret generic my-keystore-secret --from-file=mykeystore.p12
```


## bulding image

Use gradle to build spring-boot jar

Navigate to docker folder and execute

```
docker build -t my-spring-boot-app -f Dockerfile ..
```

# Getting Started

8000 port for http, 8081 port for https




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

