# Use the official Java 17 image as the base image
FROM openjdk:17-jdk

# Set the working directory to /app
WORKDIR /app

# Copy the Spring Boot application JAR file into the container
COPY target/*.jar app.jar

# Set the command to run the Spring Boot application
CMD ["java", "-jar", "app.jar"]
