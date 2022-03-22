package com.axsos.Expenses.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.axsos.Expenses.models.Travel;
import com.axsos.Expenses.repositories.TravelRepository;


@Service
public class TravelService {
	private final TravelRepository travelRepository;

	public TravelService(TravelRepository travelRepository) {
		this.travelRepository = travelRepository;
	}
    // returns all the Travels
    public List<Travel> allTravels() {
        return travelRepository.findAll();
    }
    // creates a Travel
    public Travel createTravel(Travel t) {
        return travelRepository.save(t);
    }
    // retrieves a Travel
    public Travel findTravel(Long id) {
        Optional<Travel> optionalTravel = travelRepository.findById(id);
        if(optionalTravel.isPresent()) {
            return optionalTravel.get();
        } else {
            return null;
        }
    }
    public void updateTravel(Travel travel) {
    	Travel editTravel = travelRepository.findById(travel.getId()).orElse(null);
    	assert editTravel !=null;
    	editTravel.setName(travel.getName());
    	editTravel.setVendor(travel.getVendor());
    	editTravel.setAmount(travel.getAmount());
    	editTravel.setDescription(travel.getDescription());
    	travelRepository.save(editTravel);
    	
    }
    public void deleteTravel(Long id) {
    	Travel travel = findTravel(id);
    	if(travel!=null) {
    		travelRepository.delete(travel);
    	}
    
    }


	

}
