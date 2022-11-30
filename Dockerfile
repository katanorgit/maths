FROM amazoncorretto:11
EXPOSE 8080
ADD target/maths-0.0.1-SNAPSHOT.jar mathsapi.jar
ENTRYPOINT ["java" , "-jar" , "/mathsapi.jar"]