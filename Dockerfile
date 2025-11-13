FROM eclipse-temurin:17-jdk-alpine as build
WORKDIR /app
COPY . .
RUN ./mvnw -B -DskipTests clean package

FROM eclipse-temurin:17-jre-alpine
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar
EXPOSE 8081
ENTRYPOINT ["java","-jar","/app/app.jar"]
