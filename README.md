# samplevue

Terminal Commands

// Run Vue on port 3000
cd /src/main/ui
npm install
npm run serve


// Run Java Code on 8080
mvn clean install
java -jar target/spells-0.0.1-SNAPSHOT.jar

//Kill running process on port 8080
netstat -ano | findstr :8080
taskkill /PID <PIDVALUE> /F
