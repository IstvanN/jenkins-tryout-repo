FROM openjdk:8-jdk-alpine

COPY ./spring-app/build/libs/jenkins-spring-0.0.1-SNAPSHOT.jar .

EXPOSE 8000
ENTRYPOINT ["java", "-jar", "jenkins-spring-0.0.1-SNAPSHOT.jar"]
