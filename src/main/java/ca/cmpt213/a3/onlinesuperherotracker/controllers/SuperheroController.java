package ca.cmpt213.a3.onlinesuperherotracker.controllers;

/**
 * Celina Wright
 * 301380112
 * ckwright@sfu.ca
 */

import ca.cmpt213.a3.onlinesuperherotracker.model.Superhero;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
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
    //on failure: return IllegalArgumentException as status 400
    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public Superhero addSuperhero(@RequestBody Superhero superhero) {
        //Set superhero to have next id
        //Ensures proper handling if running multiple threads
        superhero.setId(nextId.incrementAndGet());

        //Check for negative valued input
        //If invalid, throw 400
        if(superhero.getHeightInCm() < 0 || superhero.getCivilianSaveCount() < 0){
            throw new IllegalArgumentException();
        }else{
            superheroes.add(superhero);
            return superhero;
        }

    }

    //remove superhero from the system, indicated by id
    //return status 201 on success
    @PostMapping("/remove/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public List<Superhero> removeSuperhero(@PathVariable("id") long heroId){
        for (Superhero superhero : superheroes){
            if(superhero.getId() == heroId){
                superheroes.remove(superhero);
                return superheroes;
            }
        }

        throw new SuperheroNotFoundException();
    }

    //update superhero info, indicated by id
    //return status 201 on success
    @PostMapping("/update/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Superhero updateSuperhero(
            @PathVariable("id") long heroId,
            @RequestBody Superhero newSuperhero
    ){
        for (Superhero superhero : superheroes){
            if(superhero.getId() == heroId){

                //Check for negative valued input
                //If invalid, throw 400
                if(newSuperhero.getHeightInCm() < 0 || newSuperhero.getCivilianSaveCount() < 0){
                    throw new IllegalArgumentException();

                }else {
                    superheroes.remove(superhero);

                    //need to maintain previous IDs
                    newSuperhero.setId(heroId);
                    superheroes.add(newSuperhero);
                    return newSuperhero;
                }
            }
        }

        //Superhero not found - ID invalid
        //Throws a 404
        throw new SuperheroNotFoundException();
    }

    //Exception handler for negative input values
    @ResponseStatus(
            value = HttpStatus.BAD_REQUEST,
            reason = "Request Invalid - Negative Values."
    )
    @ExceptionHandler(IllegalArgumentException.class)
    public void badExceptionHandler(){
        //Nothing needed here
    }

}
