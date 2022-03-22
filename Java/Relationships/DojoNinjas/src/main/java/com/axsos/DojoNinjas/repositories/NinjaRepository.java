package com.axsos.DojoNinjas.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.axsos.DojoNinjas.models.Ninja;



public interface NinjaRepository extends CrudRepository<Ninja, Long> {
    // this method retrieves all the books from the database
    List<Ninja> findAll();

}
