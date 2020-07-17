package ca.cmpt213.a3.onlinesuperherotracker.controllers;

/**
 * Celina Wright
 * 301380112
 * ckwright@sfu.ca
 */

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * New exception for removing a superhero - superhero not found
 * Extends RuntimeException
 * Returns status 404
 */
@ResponseStatus(
        value = HttpStatus.NOT_FOUND,
        reason = "Superhero Not Found."
)
public class SuperheroNotFoundException extends RuntimeException{
    public void SuperheroNotFoundException(){
        //Nothing needed here
    }
}
