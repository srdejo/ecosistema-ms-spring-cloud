FROM openjdk:12-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} ./venta/app.jar
ENTRYPOINT ["java","-jar","./venta/app.jar"]
EXPOSE 8092