FROM openjdk:17-jdk-slim

# Set the working directory in the container
WORKDIR /app

# Copy the packaged jar file into the container
# ../build/libs/demo-gw-0.0.1-SNAPSHOT.jar must be present on local machine
COPY ../build/libs/demo-gw-0.0.1-SNAPSHOT.jar /app/myapp.jar

# Make ports 8000 and 8081 available to the world outside this container
EXPOSE 8000
EXPOSE 8081

# Run the jar file
ENTRYPOINT ["java", "-jar", "/app/myapp.jar"]
