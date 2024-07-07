FROM openjdk:22 AS build-env
WORKDIR /api
COPY ${JAR_FILE} api.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","api-0.0.1-SNAPSHOT.jar"]