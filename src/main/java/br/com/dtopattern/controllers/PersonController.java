package br.com.dtopattern.controllers;

import br.com.dtopattern.dtos.PersonDTO;
import br.com.dtopattern.entities.Employee;
import br.com.dtopattern.entities.Person;
import br.com.dtopattern.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/persons")
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping(path = "{id}")
    public ResponseEntity<PersonDTO> find(@PathVariable Integer id){
        Employee person = (Employee) personService.buscar(id);
        PersonDTO personDTO = new PersonDTO(person.getNome(), person.getCargo(), person.getSalary());
        return ResponseEntity.ok().body(personDTO);
    }


}
