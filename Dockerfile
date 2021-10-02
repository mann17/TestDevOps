FROM openjdk:8-jdk-alpine
RUN mvn clean verify
COPY target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]