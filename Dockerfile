# Use an official OpenJDK runtime as a parent image
FROM openjdk:17-jdk-alpine

# Set the working directory in the container
WORKDIR /app

# Copy the current directory contents into the container at /app
COPY target/leaderQuartz-0.0.1.jar /app/leaderQuartz.jar

# Make port 8989 available to the world outside this container
EXPOSE 8989

# Run the jar file
ENTRYPOINT ["java", "-jar", "leaderQuartz.jar"]

# Build
# docker build -t leaderquartz:latest .

