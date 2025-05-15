# Stage 1: Build using Gradle and JDK 21
FROM gradle:8.5-jdk21 AS build

WORKDIR /app

# Copy Gradle build scripts
COPY build.gradle settings.gradle gradlew /app/
COPY gradle /app/gradle

# Pre-download dependencies (optional, speeds up rebuilds)
RUN ./gradlew --no-daemon build || return 0

# Copy source code
COPY . /app

# Build the app
RUN ./gradlew bootJar --no-daemon

# Stage 2: Run with a lightweight JDK 21 image
FROM eclipse-temurin:21-jdk-alpine

WORKDIR /app

# Copy built jar
COPY --from=build /app/build/libs/*.jar app.jar

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
d