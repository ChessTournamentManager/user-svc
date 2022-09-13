FROM maven:3.8.6-openjdk-18-slim

ADD target/user-svc.jar user-svc.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/user-svc.jar"]
