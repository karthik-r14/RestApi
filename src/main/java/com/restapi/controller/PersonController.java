package com.restapi.controller;

import com.restapi.domain.Person;
import com.restapi.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {
    private PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Person> listAllPersons() {
        return personService.findAllPersons();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Person showAPerson(@PathVariable long id) {
        return personService.findPerson(id);
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public void createPerson(@RequestBody Person person) {
        personService.createPerson(person);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void updatePerson(@PathVariable long id, @RequestBody Person person) {
        personService.updatePerson(id, person);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deletePerson(@PathVariable long id) {
        personService.deletePerson(id);
    }
}
