FROM openjdk:17-jdk-slim

# Set the working directory
WORKDIR /app

# Copy the Maven project files
COPY . .

# Build the project using Maven
RUN mvn clean install  \
    && RUN mvn build  \
    && RUN mvn package

# Copy the Maven project files
COPY ./target/gmail-clone-backend-*.jar app.jar

# Expose the application port
EXPOSE 8080

# Command to run the application
CMD ["java", "-jar", "app.jar"]