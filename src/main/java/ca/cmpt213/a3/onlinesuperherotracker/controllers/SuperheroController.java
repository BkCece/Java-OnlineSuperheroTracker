package ca.cmpt213.a3.onlinesuperherotracker.controllers;


import ca.cmpt213.a3.onlinesuperherotracker.model.Superhero;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
/**
 * Controllers set up endpoints for web API
 * Rest controller contains roots
 * Run application main to start 'server'
 * Can be called through Windows terminal as curl -i -H "Content-Type: application/json" -X GET localhost:8080/hello
 * OR appended to localhost as localhost:8080/hello in a browser
 *
 */
public class SuperheroController {
    //Store superhero list privately
    private List<Superhero> superheroes = new ArrayList<>();

    //return string greeting to user saying hello & welcome
    @GetMapping("/hello")
    public String getHelloMessage(){
        return "Hello and Welcome to Superhero Tracker - Online!";
    }

    //return all superheroes as JSON array object


    //post to add a new superhero and respond with status 201
    @PostMapping("/add")
    public static void addSuperhero(@RequestBody Superhero superhero) {

    }

}
