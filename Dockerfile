FROM openjdk:18-jdk-alpine
WORKDIR "/home"
COPY . .
RUN apk add maven
WORKDIR "/home/demo"
RUN mvn clean package
EXPOSE 8080
CMD [ "java", "-jar",  "/home/demo/target/calculadora5w-1-jar-with-dependencies.jar"]