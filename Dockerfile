FROM docker.io/openjdk:19-jdk-alpine

WORKDIR /home

COPY ./target/*.jar /home/demo.jar

CMD ["java", "-jar", "/home/demo.jar"]
