mvn compile exec:java -Dexec.mainClass=com.giga.springlab.App -DskipTests
mvn clean install -U package
sudo docker compose up --build --remove-orphans