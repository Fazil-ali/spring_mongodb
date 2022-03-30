FROM amazoncorretto:11-alpine-jdk
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
WORKDIR /usr/app
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]
