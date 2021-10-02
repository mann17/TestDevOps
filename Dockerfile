FROM openjdk:8-jdk-alpine
ARG JAR_FILE=/home/runner/.m2/repository/org/mann/test/testdevops/testdevops/0.0.1-SNAPSHOT/testdevops-0.0.1-SNAPSHOT.jar
COPY /home/runner/.m2/repository/org/mann/test/testdevops/testdevops/0.0.1-SNAPSHOT/testdevops-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]