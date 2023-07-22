package com.getechnologies.apirest;

import com.getechnologies.apirest.models.Persona;
import com.getechnologies.apirest.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class PersonaService {
    @Autowired
    private PersonaRepository personaRepository;

    public Persona createPersona(Persona persona){
        return personaRepository.save(persona);
    }

    public Persona getPersonaByID(Long id){
        Optional<Persona> optionalPersona = personaRepository.findById(id);
        return optionalPersona.get();
    }

    public List<Persona> getAllPersonas(){
        return personaRepository.findAll();
    }

    public void deletePersona(Long id){
        personaRepository.deleteById(id);
    }
}
