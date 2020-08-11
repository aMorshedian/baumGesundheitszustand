FROM maven:3.6.3-jdk-8
COPY . /home/src
WORKDIR /home/src
RUN mvn clean package -DskipTests
EXPOSE 8080
WORKDIR /home/src/target
ENTRYPOINT ["java" , "-jar" , "gesundheitszustand-0.0.1-SNAPSHOT.jar", "--spring.profiles.active=prod"]
