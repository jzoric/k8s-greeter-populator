package com.jovicazoric.populator.service;

import com.jovicazoric.populator.model.Person;
import com.jovicazoric.populator.repository.PersonRepository;
import lombok.Data;
import org.springframework.stereotype.Service;

@Service
@Data
public class PersonService {

    private final PersonRepository personRepository;

    public void save(String name){
        var person = Person.builder().name(name).build();
        personRepository.save(person);
    }
}
