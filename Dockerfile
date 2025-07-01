FROM openjdk:17-jdk-slim

WORKDIR /application

COPY target/demo-0.0.1-SNAPSHOT.jar application.jar

ENTRYPOINT ["java", "-jar", "application.jar"]
