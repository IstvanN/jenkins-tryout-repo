FROM openjdk:8-jdk-alpine

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "spring-app/build/libs/jenkins-spring-0.0.1-SNAPSHOT.jar"]
