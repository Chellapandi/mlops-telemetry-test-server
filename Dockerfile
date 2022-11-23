FROM adoptopenjdk/openjdk11:alpine-jre
COPY build/libs/*.jar mlops-telemetry.jar
EXPOSE 9001
ENTRYPOINT ["java","-jar","/mlops-telemetry.jar"]