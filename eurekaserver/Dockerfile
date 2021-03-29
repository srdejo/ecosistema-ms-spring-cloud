FROM openjdk:12-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} ./eureka/app.jar
ENTRYPOINT ["java","-jar","./eureka/app.jar"]
EXPOSE 8099