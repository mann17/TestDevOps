FROM openjdk:8-jdk-alpine
WORKDIR /workspace/app

COPY mvnw .
COPY .mvn .mvn
COPY pom.xml .
COPY src src

RUN ./mvnw clean verify

RUN mv target/*.jar app.jar

ENTRYPOINT ["java","-jar","/app.jar"]