FROM amazoncorretto:21
ADD target/demo-jenkins-k8s-0.0.1-SNAPSHOT.jar cartservice.jar
ENTRYPOINT ["java", "-jar", "cartservice.jar"]
EXPOSE 9091
### Testing
