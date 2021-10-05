FROM openjdk:8u171-alpine3.7
COPY ./target/*.jar dekorate-challenge.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","dekorate-challenge.jar"]