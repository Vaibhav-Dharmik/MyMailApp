# ===========================
# Stage 1: Build the application using Maven
# ===========================
FROM maven:3.9.4-eclipse-temurin-17 AS build

# Set the working directory
WORKDIR /app

# Copy the entire project into the container
COPY . .

# Build the application
RUN mvn clean install

# ===========================
# Stage 2: Run the application
# ===========================
FROM openjdk:17-jdk-slim

# Set working directory
WORKDIR /app

# Copy the generated JAR from the build stage
COPY --from=build /app/target/gmail-clone-backend-*.jar app.jar

# Expose port 8080
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
