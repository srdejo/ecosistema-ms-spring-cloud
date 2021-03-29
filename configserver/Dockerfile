FROM openjdk:12-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} ./config/app.jar
ENTRYPOINT ["java","-jar","./config/app.jar"]
EXPOSE 8888