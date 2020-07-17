package ca.cmpt213.a3.onlinesuperherotracker.controllers;


import ca.cmpt213.a3.onlinesuperherotracker.model.Superhero;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;


/**
 * Controllers set up endpoints for web API
 * Rest controller contains roots
 * Run application main to start 'server'
 * Can be called through Windows terminal as curl -i -H "Content-Type: application/json" -X GET localhost:8080/hello
 * OR appended to localhost as localhost:8080/hello in a browser
 */
@RestController
public class SuperheroController {
    //Store superhero list privately
    private List<Superhero> superheroes = new ArrayList<>();
    private AtomicLong nextId = new AtomicLong();

    //return string greeting to user saying hello & welcome
    @GetMapping("/hello")
    public String getHelloMessage(){
        return "Hello and Welcome to Superhero Tracker - Online!";
    }

    //return all superheroes as JSON array object
    @GetMapping("/listAll")
    public List<Superhero> getAllSuperheroes(){
        return superheroes;
    }

    //post to add a new superhero and respond with status 201
    @PostMapping("/add")
    public Superhero addSuperhero(@RequestBody Superhero superhero) {
        //Set superhero to have next id
        //Ensures proper handling if running multiple threads
        superhero.setId(nextId.incrementAndGet());

        superheroes.add(superhero);
        return superhero;
    }

    //remove superhero from the system, indicated by id
    @PostMapping("/remove/{id}")
    public List<Superhero> removeSuperhero(@PathVariable("id") long heroId){

        for (Superhero superhero : superheroes){
            if(superhero.getId() == heroId){
                superheroes.remove(superhero);
            }
        }

        return superheroes;

        //throw new SuperheroNotFoundException();
        //return null;
    }

    //update superhero info, indicated by id
    @PostMapping("/update/{id}")
    public Superhero updateSuperhero(
            @PathVariable("id") long heroId,
            @RequestBody Superhero newSuperhero
    ){
        for (Superhero superhero : superheroes){
            if(superhero.getId() == heroId){
                superheroes.remove(superhero);

                //need to maintain previous ides
                newSuperhero.setId(heroId);
                superheroes.add(newSuperhero);
                return newSuperhero;
            }
        }

        //throw new SuperheroNotFoundException();
        return null;
    }

}
