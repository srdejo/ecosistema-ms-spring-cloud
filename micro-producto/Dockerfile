FROM openjdk:12-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} ./producto/app.jar
ENTRYPOINT ["java","-jar","./producto/app.jar"]
EXPOSE 8091