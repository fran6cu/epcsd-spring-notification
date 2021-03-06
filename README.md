# epcsd-spring-notification


To execute this microservice:


### Previous steps:

1. Download to local machine docker-compose descriptors with git clone command (https://github.com/ppinedar/epcsd-spring)
```
git clone https://github.com/ppinedar/epcsd-spring.git
```
2. Be sure you have docker and docker-compose binaries installed and working
3. Execute from local path command 'docker-compose up', wait until all containers are up.
``` 
cd epcsd-spring
docker-compose up 
```
    
    - Zookeeper
    - Kafka
    - Postgresql
    - Adminer

4. Verify containers are up and running with command 
``` 
docker ps
``` 


### Steps to build this artifact:

1. Download project repo to the local machine with git clone command
```
git clone https://github.com/fran6cu/epcsd-spring-notification.git
```
2. Build maven project with command 
``` 
cd epcsd-spring-notification
mvn clean install
``` 
4. Locate JAR packet and execute with java -jar packet-name.jar
```
cd target
java -jar notification-0.0.1-PRAC2.jar
``` 

**ALL** this steps can be done using IDE.


Test project with Swagger http://localhost:18082/swagger-ui/index.html#/

A module springdoc-openapi has been included that auto-generates and publishes the microservice definition file in format
JSON/OpenAPI v3 http://localhost:18082/v3/api-docs/ 



Happy testing!!
