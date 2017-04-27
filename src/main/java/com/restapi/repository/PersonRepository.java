package com.restapi.repository;

import com.restapi.domain.Person;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PersonRepository extends CrudRepository<Person, Long> {

    List<Person> findAllPerson();

    Person findPerson(long id);
}
