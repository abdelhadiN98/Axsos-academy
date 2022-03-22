package com.axsos.DojoNinjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.axsos.DojoNinjas.models.Ninja;
import com.axsos.DojoNinjas.repositories.NinjaRepository;

@Service
public class NinjaService {
	private final NinjaRepository ninjaRepository;

	public NinjaService(NinjaRepository ninjaRepository) {
		this.ninjaRepository = ninjaRepository;
	}
	
	 // returns all the Ninjas
    public List<Ninja> allNinjas() {
        return ninjaRepository.findAll();
    }
    // creates a ninja
    public Ninja createNinja(Ninja b) {
        return ninjaRepository.save(b);
    }
    // retrieves a Ninja
    public Ninja findNinja(Long id) {
        Optional<Ninja> optionalNinja = ninjaRepository.findById(id);
        if(optionalNinja.isPresent()) {
            return optionalNinja.get();
        } else {
            return null;
        }
    }
	

}
