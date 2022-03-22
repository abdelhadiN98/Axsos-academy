package com.axsos.Expenses.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.axsos.Expenses.models.Travel;
import com.axsos.Expenses.services.TravelService;

@Controller
public class TestTravel {
	private final TravelService travelService;
	
	public TestTravel(TravelService travelService) {
		this.travelService = travelService;
	}

	@RequestMapping("/expenses")
	public String display(Model model, @ModelAttribute("travels") Travel travels) {
		List <Travel> travel = travelService.allTravels();
		model.addAttribute("travel", travel);
		return "main.jsp";
	}
	@RequestMapping(value = "/create" , method = RequestMethod.POST)
	public String form(@Valid @ModelAttribute("travels") Travel travels, BindingResult result ) {
		if (result.hasErrors()) {
			return "main.jsp";
		}
		else {
			travelService.createTravel(travels);
			return "redirect:/expenses";
		}
	}
	@RequestMapping("/expenses/edit/{id}")
	public String edit(@PathVariable("id") Long id , Model model,@ModelAttribute("travels") Travel travels) {
		Travel trav = travelService.findTravel(id);
		model.addAttribute("trav", trav);
		return "Edit.jsp";
	}
	@RequestMapping(value ="/edit/{id}", method = RequestMethod.PUT)
	public String updateForm(@Valid @ModelAttribute("travels") Travel travels , BindingResult result) {
		if (result.hasErrors()) {
			return "Edit.jsp";
		}
		else {
			travelService.updateTravel(travels);
			return "redirect:/expenses";
		}
	}
	@RequestMapping(value ="/delete/{id}", method = RequestMethod.DELETE)
	public String destroy(@PathVariable("id") Long id, Model model,@ModelAttribute("travels") Travel travels) {
		travelService.deleteTravel(id);
		return "redirect:/expenses";
	}
	@RequestMapping("/expenses/{id}")
	public String details(@PathVariable("id") Long id , Model model) {
		Travel details = travelService.findTravel(id);
		model.addAttribute("details", details);
		return "details.jsp";
	}
	

}
