FROM openjdk:8-jdk-alpine
EXPOSE 8080
ADD /build/libs/dockerdemo-0.0.1-app.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]