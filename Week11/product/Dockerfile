FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY target/*.jar product-spring-boot.jar
ENTRYPOINT ["java","-jar","/product-spring-boot.jar"]