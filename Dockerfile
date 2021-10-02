FROM openjdk:8-jdk-alpine
RUN ./mvnw clean verify
COPY target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]