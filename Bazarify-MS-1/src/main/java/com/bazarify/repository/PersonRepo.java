package com.bazarify.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bazarify.model.Person;
@Repository
public interface PersonRepo extends JpaRepository<Person, Integer> {

}
