FROM eclipse-temurin:17-jdk-focal
WORKDIR /app-java
COPY src ./src
COPY gradle ./gradle
COPY build.gradle gradlew settings.gradle ./
ENTRYPOINT sh gradlew bootJar && java -jar build/libs/kotoba-0.0.1-SNAPSHOT.jar
