#### Stage 1: Build the application
FROM openjdk:8-jdk-alpine as build

# Set the current working directory inside the image
WORKDIR /app

# Copy maven executable to the image
COPY mvnw .
COPY .mvn .mvn

# Copy the pom.xml file
COPY pom.xml .

# Build all the dependencies in preparation to go offline.
# This is a separate step so the dependencies will be cached unless
# the pom.xml file has changed.
ONBUILD RUN ./mvnw dependency:go-offline -B

# Copy the project source
COPY src src

# Package the application
ONBUILD RUN ./mvnw package -DskipTests
ONBUILD RUN mkdir -p target/dependency && (cd target/dependency; jar -xf ../*.jar)

#### Stage 2: A minimal docker image with command to run the app
FROM openjdk:8-jre-alpine


ENTRYPOINT ["java","-cp","app:app/lib/*","com.example.cityeventservice.CityEventServiceApplication"]