# Use a Java runtime as a base image
FROM openjdk:latest

# Set the working directory in the container
WORKDIR /app

# Copy the Java source files into the container
COPY src/main/java/org/apache/httpcomponents/httpclient/*.java /app

# Compile the Java code
RUN javac *.java

# Set the entry point for the container
CMD ["java", "App"]
