package com.jovicazoric.populator.repository;

import com.jovicazoric.populator.model.Person;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PersonRepository extends MongoRepository<Person, String> {
}
