# flash-sanitise
This is a demo app to indicate the possibly of a sanitise restful api
                        
## Requirements

This project needs Java 22 to run as well as the latest version of Maven.

## How to run the project

When the project is first checked out please execute the following statement
```bash
mvn clean package
```
This will execute the maven build and package the war artefact.
When the build is completed you can execute the following statement
```bash
./run.sh
```
This will start the project. For reference I did add an IntelliJ IDEA http file **sanitise-api.http** to see available
tests which can be executed using that IDE. If the IDE is not available you could try some curl
statements which is also left for reference.

You can access the in memory database using the following url in your browser **http:localhost:8080/api/h2-console**
