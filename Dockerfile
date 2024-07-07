
# Package stage
#
FROM openjdk:22
COPY target/api-0.0.1-SNAPSHOT.jar api-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/api-0.0.1-SNAPSHOT.jar"]