FROM openjdk:11
WORKDIR /workspace/app

COPY mvnw .
COPY .mvn .mvn
COPY pom.xml .
COPY src src

RUN ./mvnw clean verify

RUN mv target/testdevops-*.jar /app.jar

ENTRYPOINT ["java","-jar","/app.jar"]