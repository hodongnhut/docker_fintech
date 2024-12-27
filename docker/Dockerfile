# Use OpenJDK as the base image
FROM openjdk:17-jdk-slim

# Set the working directory
WORKDIR /app

# Copy the Spring Boot JAR file
COPY target/application.jar app.jar

# Expose the port for the application (includes WebSocket traffic)
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
