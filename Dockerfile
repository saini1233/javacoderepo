FROM openjdk:8
EXPOSE 9090
ADD target/carpet-rest-apis.jar carpet-rest-apis.jar
ENTRYPOINT ["java","-jar","/carpet-rest-apis.jar"]