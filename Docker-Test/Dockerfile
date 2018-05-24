FROM openjdk:8-jre-alpine
# Add Maintainer Info
LABEL maintainer="demosite890@gmail.com"

# Add a volume pointing to /tmp
VOLUME /tmp

# Make port 8080 available to the world outside this container
EXPOSE 7000

# The application's jar file
ARG JAR_FILE=target/Docker-Test-0.0.1-SNAPSHOT.jar

# Add the application's jar to the container
ADD ${JAR_FILE} Docker-Test-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/Docker-Test-0.0.1-SNAPSHOT.jar"]