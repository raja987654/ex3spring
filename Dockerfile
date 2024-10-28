FROM eclipse-temurin:17-jre
WORKDIR /app
COPY target/demo2-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
<<<<<<< Updated upstream

# Command to run the application
=======
>>>>>>> Stashed changes
ENTRYPOINT ["java", "-jar", "app.jar"]
