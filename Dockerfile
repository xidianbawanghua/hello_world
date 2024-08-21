FROM openjdk:8-jre
ADD /target/*.jar /hello_world.jar
ENTRYPOINT ["java", "-jar","/hello_world.jar"]