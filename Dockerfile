
# Package stage
#
FROM openjdk:22
EXPOSE 8080
ENTRYPOINT ["java","-jar","/Users/kavyapandey/IdeaProjects/api/target/api-0.0.1-SNAPSHOT.jar"]