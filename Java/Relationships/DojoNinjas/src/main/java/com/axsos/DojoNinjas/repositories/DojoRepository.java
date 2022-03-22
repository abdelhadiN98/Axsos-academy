package com.axsos.DojoNinjas.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.axsos.DojoNinjas.models.Dojo;

public interface DojoRepository extends CrudRepository<Dojo, Long> {
    // this method retrieves all the books from the database
    List<Dojo> findAll();

}
