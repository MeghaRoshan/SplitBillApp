FROM openjdk:8-jdk-alpine
EXPOSE 8080
ADD /build/libs/app.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]