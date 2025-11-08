mvn compile -DskipTests
mvn clean install -U package
sudo docker compose up --build --remove-orphans