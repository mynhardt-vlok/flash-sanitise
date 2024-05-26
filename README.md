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

Swagger docs is available at the following [location](http://localhost:8080/api/swagger-ui.html)
You can access the in memory database using the following [url](http:localhost:8080/api/h2-console) in your browser