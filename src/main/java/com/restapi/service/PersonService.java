package com.restapi.service;

import com.restapi.domain.Person;
import com.restapi.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    private PersonRepository repository;

    @Autowired
    public PersonService(PersonRepository repository) {
        this.repository = repository;
    }

    public List<Person> findAllPersons() {
        return (List<Person>) repository.findAll();
    }

    public Person findPerson(long id) {
        return repository.findOne(id);
    }

    public void createPerson(Person person) {
        repository.save(person);
    }

    public void updatePerson(long id, Person person) {
    }

    public void deletePerson(long id) {
        repository.delete(id);
    }
}
