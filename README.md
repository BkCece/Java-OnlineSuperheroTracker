# Java-OnlineSuperheroTracker

## Assignment 3 Part 2: OST
### Description
- This assignment is for CMPT 213 taught at Simon Fraser University in Summer 2020, taught by Victor Cheung
- In this part you are going to create an online (but simplified) version of the Superhero Tracker system in Assignment 1 using Sprint Boot REST API.
- Must respond to commands:
  - GET /hello
  - GET /listall
  - POST /add
  - POST /remove/id
  - POST /update/id
  - (Additional feature:) GET /listTop3
    
### Curl Commands 
- The cURL tool is a command letting users to send and receive data between a client and a server. 
- **It is available in recent Windows.** 
- It supports many options but here we only need to do simple GETs/POSTs. For example, the following sends a GET request to a localhost server.
- *curl -i -H "Content-Type: application/json" -X GET localhost:8080/hello*

## Resources
- Class to print JSON in [pretty format](https://github.com/drbfraser/SpringBootIntro/blob/master/src/main/java/ca/pledgetovote/controllers/MakeSpringPrettyPrintJSON.java)
- Reference for creating a [Simple IntelliJ Gradle Project](https://stackoverflow.com/questions/49710330/src-folder-not-created-when-creating-simple-intellij-java-gradle-project)
- JetBrains' guide for [Creating a Project in IntelliJ](https://www.jetbrains.com/help/idea/gradle.html)
- Dr. Brain Fraser's tutorial on [Setting up Spring Boot in IntelliJ](https://www.youtube.com/watch?v=he63dwZdhOM)
- Dr. Brian Fraser's tutorial on [Making a Rest API](https://www.youtube.com/watch?v=rXBsnNCH59o)
- Tutorial on [Using the Postman Tool to test](https://www.youtube.com/watch?v=-HTV4NTKo7I)
- Spring's guid to [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)