FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD target/*.jar app.jar
ENV JAVA_OPTS=''
ENTRYPOINT ["java", "-jar","app.jar"]