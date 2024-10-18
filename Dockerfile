FROM openjdk:8-jdk-alpine

WORKDIR /app

COPY . /app

CMD ["java", "SumofThree"]

