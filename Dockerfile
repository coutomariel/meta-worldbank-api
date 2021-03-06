FROM openjdk:8-jdk-alpine
WORKDIR /app
COPY target/worldbank-api-0.0.1-SNAPSHOT.jar /app/spring-app.jar
ENTRYPOINT ["java","-jar","spring-app.jar"]