FROM openjdk:12-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} ./gateway/app.jar
ENTRYPOINT ["java","-jar","./gateway/app.jar"]
EXPOSE 8080