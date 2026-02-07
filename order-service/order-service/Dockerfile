# -------- Stage 1: Build the JAR --------
FROM eclipse-temurin:17-jdk-alpine AS builder

WORKDIR /app

# Copy entire project (src, gradle files, wrapper)
COPY . .

# Build the application
RUN ./gradlew clean build

# -------- Stage 2: Runtime image --------
FROM eclipse-temurin:17-jre-alpine

WORKDIR /app

COPY --from=builder /app/build/libs/*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]

