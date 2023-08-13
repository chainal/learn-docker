FROM gradle:8.2.1-jdk17
WORKDIR /root
COPY build.gradle settings.gradle ./
RUN gradle dependencies
COPY src ./src
RUN gradle bootJar

FROM eclipse-temurin:17-jdk-focal
WORKDIR /root
COPY --from=0 /root/build/libs/kotoba-0.0.1-SNAPSHOT.jar .
ENTRYPOINT java -jar kotoba-0.0.1-SNAPSHOT.jar
