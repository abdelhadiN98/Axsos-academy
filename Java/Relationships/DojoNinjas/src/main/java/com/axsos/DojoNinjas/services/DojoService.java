package com.axsos.DojoNinjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.axsos.DojoNinjas.models.Dojo;
import com.axsos.DojoNinjas.repositories.DojoRepository;

@Service
public class DojoService {
	private final DojoRepository dojoRepository;

	public DojoService(DojoRepository dojoRepository) {
		this.dojoRepository = dojoRepository;
	}
	
	 // returns all the Dojos
    public List<Dojo> allDojos() {
        return dojoRepository.findAll();
    }
    // creates a dojo
    public Dojo createDojo(Dojo b) {
        return dojoRepository.save(b);
    }
    // retrieves a Dojo
    public Dojo findDojo(Long id) {
        Optional<Dojo> optionalBook = dojoRepository.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }
	
	

}
