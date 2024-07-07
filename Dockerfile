FROM openjdk:22 AS build-env
WORKDIR /api
COPY target/api-0.0.1-SNAPSHOT.jar api.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","api.jar"]
