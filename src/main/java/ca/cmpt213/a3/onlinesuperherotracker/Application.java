package ca.cmpt213.a3.onlinesuperherotracker;

//Required for spring
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
/**
 * Main class to run OST app
 */
public class Application {
    public static void main(String[] args){
        //Run this file: Application
        SpringApplication.run(Application.class, args);
    }
}
