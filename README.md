# spring-boot-webflux-reactive-mongo

This is a sample application that shows how to build a web application using

Spring Boot 2
Spring Webflux
Spring Reactive Data MongoDb
Spring Security Reactive Webflux

![alt text](https://docs.spring.io/spring/docs/5.0.0.BUILD-SNAPSHOT/spring-framework-reference/html/images/webflux-overview.png)

Running
In application.properties, configure appropriate values. 

Run this using using the gradle wrapper included

# ./gradlew bootRun

# cURL Commands
You can try the following API's once the server is running.

GET /person

curl http://localhost:8080/person -v -u test:password

GET /person/{id}

curl http://localhost:8080/person/{id} -v -u test:password

POST /person

curl -X POST -d '{"name":"Test Test","age":20}' -H "Content-Type: application/json" http://localhost:8080/person -v -u test:password
