package br.com.dtopattern.services;

import br.com.dtopattern.entities.Person;
import br.com.dtopattern.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class PersonService {


    @Autowired
    private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public Person buscar(Integer id){
        Optional<Person> person = personRepository.findById(id);
        return person.orElseThrow(()-> new NoSuchElementException());
    }


}
