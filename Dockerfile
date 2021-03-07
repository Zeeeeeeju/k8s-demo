FROM openjdk:8-jdk-alpine
ADD ./build/libs/demo-0.0.1-SNAPSHOT.jar zeju-k8s-demo.jar
CMD ["java", "-jar", "./zeju-k8s-demo.jar", "-Xms256m", "-Xmx512m","-Dspring.profiles.active","deploy"]
