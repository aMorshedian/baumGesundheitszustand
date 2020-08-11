# baumGesundheitszustand
Anwendung zum Tracken des Gesundheitszustandes von Straßenbegleitgrün
For building the project run:
mvn clean package

After that the jar file is created in the target folder run the jar file.
java -jar gesundheitszustand-0.0.1-SNAPSHOT.jar --spring.profiles.active=prod

After running the jar file open the page: http://localhost:8080/swagger-ui.html#/


In case you want to use docker-compose:
docker-compose up --build

After that open the page: http://localhost:8080/swagger-ui.html#/
