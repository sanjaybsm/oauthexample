# Use a base image with Java 11 installed
FROM openjdk:17-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file of your Spring Boot application to the container
COPY target/oauthexample-0.0.1-SNAPSHOT.jar app.jar

# Expose the port that your Spring Boot application listens on
EXPOSE 8080

# Set the command to run your Spring Boot application when the container starts
CMD ["java", "-jar", "app.jar"]