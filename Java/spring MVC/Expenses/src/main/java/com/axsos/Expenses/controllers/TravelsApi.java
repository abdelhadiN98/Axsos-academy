package com.axsos.Expenses.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.axsos.Expenses.models.Travel;
import com.axsos.Expenses.services.TravelService;
@RestController
public class TravelsApi {
	private final TravelService travelService;
	

	public TravelsApi(TravelService travelService) {
		this.travelService = travelService;
	}
	
    @RequestMapping("/api/travels")
    public List<Travel> index() {
        return travelService.allTravels();
    }
    @RequestMapping(value="/api/travels", method=RequestMethod.POST)
    public Travel create(@RequestParam(value="name") String name, @RequestParam(value="description") String description, @RequestParam(value="vendor") String vendor, @RequestParam(value="amount") Double amount) {
        Travel book = new Travel(name, description, vendor, amount);
        return travelService.createTravel(book);
    }
    @RequestMapping("/api/travels/{id}")
    public Travel show(@PathVariable("id") Long id) {
        Travel travel = travelService.findTravel(id);
        return travel;
    }
	

	

}
