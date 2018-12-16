FROM openjdk:8-jdk-alpine
COPY ./build/libs/product-catalog-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 9090
ENTRYPOINT ["sh", "-c", "java -jar /app.jar "]
