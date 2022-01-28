# syntax=docker/dockerfile:1
FROM clojure:latest as builder

WORKDIR /app 

COPY project.clj ./
RUN lein deps

COPY /src ./src
RUN lein uberjar

FROM openjdk:18-jdk-alpine

WORKDIR /app

COPY --from=builder app/target/uberjar/clojure-test-*-standalone.jar ./clojure-app.jar

RUN adduser -D clojure
USER clojure

CMD ["java", "-jar", "clojure-app.jar"]

