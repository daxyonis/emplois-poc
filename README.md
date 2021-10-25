# Simple proof of concept for a jobs platform
The application is a Spring Boot backend with a Vue frontend packaged as a single jar.

## Running the backend
For development mode, it's nice to run the backend separately as the frontend. 
    ```
	./mvnw spring-boot:run
	```
	
## Running the frontend
For development mode:
    ```
	npm run serve
	```
	
## Packaging as a jar
For packaging as a single jar, do
   ```
   ./mvnw clean install
   ```
   
This will build the frontend and copy the SPA inside the static directory of the JAR.
