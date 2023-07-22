package com.getechnologies.apirest.controller;

import com.getechnologies.apirest.PersonaService;
import com.getechnologies.apirest.models.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("api/personas")
public class PersonaController {
    @Autowired
    private PersonaService personaService;

    @PostMapping
    public Persona createPersona(@RequestBody Persona persona){
        return personaService.createPersona(persona);
    }

    @GetMapping
    public List<Persona> getAllPersonas(){
        return personaService.getAllPersonas();
    }

    @GetMapping("{id}")
    public Persona searchPersonaID(@PathVariable("id") Long id){
        return personaService.getPersonaByID(id);
    }

    @DeleteMapping("{id}")
    public void deletePersonaID(@PathVariable("id") Long id){
        personaService.deletePersona(id);
    }

}
