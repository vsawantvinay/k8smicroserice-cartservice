FROM amazoncorretto:21
ADD target/microservice-cartservice-0.0.1-SNAPSHOT.jar cartservice.jar
ENTRYPOINT ["java", "-jar", "cartservice.jar"]
EXPOSE 9091
### Testing
