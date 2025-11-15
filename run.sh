mvn compile -DskipTests
mvn clean install -U package
docker compose up --remove-orphans