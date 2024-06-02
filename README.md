# Requirements

Kubernetes on AWS/GCP etc. or local minikube. Nginx-Ingress-Controller.


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

