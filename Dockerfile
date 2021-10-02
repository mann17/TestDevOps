FROM openjdk:8-jdk-alpine

COPY mvnw .
COPY .mvn .mvn
COPY pom.xml .
COPY src src

RUN ./mvnw clean verify

COPY target/*.jar app.jar

ENTRYPOINT ["java","-jar","/app.jar"]