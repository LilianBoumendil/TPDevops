package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/personne")
public class PersonneController {


//    @GetMapping("/json")
@GetMapping(value = "/json", produces = "application/json")
public Personne sendPersone() {
        System.out.println("ici");
        Personne personne = new Personne();
    System.out.println("personne : " + personne.toString());
        return personne;
    }
}
