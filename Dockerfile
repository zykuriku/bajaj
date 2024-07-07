FROM openjdk:22 AS build-env
WORKDIR /api
EXPOSE 8080
ENTRYPOINT ["java","-jar","${JAR_FILE}"]
