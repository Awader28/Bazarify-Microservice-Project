package com.bazarify.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bazarify.model.Person;
import com.bazarify.repository.PersonRepo;

@Service
public class PersonService {
    @Autowired
    private PersonRepo repo;

    public Optional<Person> getPersonById(int personId) {
        return repo.findById(personId);
    }

    public List<Person> getAllPersons() {
        return repo.findAll();
    }
}
