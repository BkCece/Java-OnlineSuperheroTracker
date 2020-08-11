# Java-OnlineSuperheroTracker

## Assignment 3 Part 2: OST
### Description
- This assignment is for CMPT 213 at Simon Fraser University, taught by Victor Cheung in Summer 2020
- This half of the assignment is an online (but simplified) version of the Superhero Tracker system from Assignment 1
- The online components are built using **Sprint Boot REST API**
- *The game state is not saved between sessions - no server persistence*

### Concepts and Tools
- The **cURL** tool is used for this project to send and receive data between client and server, through HTTP Requests
  - An example cURl command: the following sends a GET request to a localhost server.
  - *curl -i -H "Content-Type: application/json" -X GET localhost:8080/hello*
- This project uses the **Gradle** build system in **IntelliJ** to manage dependencies and **Spring Boot** as a tool to integrate web services into Java


## Resources
- Class to print JSON in [pretty format](https://github.com/drbfraser/SpringBootIntro/blob/master/src/main/java/ca/pledgetovote/controllers/MakeSpringPrettyPrintJSON.java)
- Reference for creating a [Simple IntelliJ Gradle Project](https://stackoverflow.com/questions/49710330/src-folder-not-created-when-creating-simple-intellij-java-gradle-project)
- JetBrains' guide for [Creating a Project in IntelliJ](https://www.jetbrains.com/help/idea/gradle.html)
- Dr. Brain Fraser's tutorial on [Setting up Spring Boot in IntelliJ](https://www.youtube.com/watch?v=he63dwZdhOM)
- Dr. Brian Fraser's tutorial on [Making a Rest API](https://www.youtube.com/watch?v=rXBsnNCH59o)
- Tutorial on [Using the Postman Tool to test](https://www.youtube.com/watch?v=-HTV4NTKo7I)
- Spring's guid to [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
