// PersonController.java
package com.bazarify.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bazarify.model.Person;
import com.bazarify.service.PersonService;

@RestController
@RequestMapping("/person")
public class PersonController {
    @Autowired
    private PersonService service;

    @GetMapping("/test")
    public String test() {
        System.out.println("SERVICE UP");
        return "UP";
    }

    @GetMapping("/{personId}")
    public Optional<Person> getPersonById(@PathVariable int personId) {
        return service.getPersonById(personId);
    }
    @GetMapping("/all")
    public List<Person> getAllPersons() {
        return service.getAllPersons();
    }

}
