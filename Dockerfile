FROM eclipse-temurin:21
COPY target/*.jar fedissary-web.jar
EXPOSE 443
CMD ["java", "-jar", "fedissary-web.jar"]