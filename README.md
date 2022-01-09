# springboot-https-demo

### This is a simple application demonstrating setting up https in spring boot applications.

#### Step 1
Create a self signed certificate by using a following command.

```
keytool -genkeypair -keyalg rsa -alias https-demo -keypass pkpassword -validity 365 -storepass kspassword -keystore https-demo.jks
```

copy https-demo.jks onto resources folder.

#### Step 2
add below properties to application.properties file.

```
server.port=8443
server.ssl.key-alias=https-demo
server.ssl.key-store-type=JKS
server.ssl.key-password=pkpassword
server.ssl.key-store-password=kspassword
server.ssl.key-store=classpath:https-demo.jks

```


#### Step 3 
Run the application



