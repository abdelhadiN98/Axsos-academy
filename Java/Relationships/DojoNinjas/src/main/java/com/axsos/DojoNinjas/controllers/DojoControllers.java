package com.axsos.DojoNinjas.controllers;

import javax.validation.Valid;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.axsos.DojoNinjas.models.Dojo;
import com.axsos.DojoNinjas.services.DojoService;



@SpringBootApplication
@Controller
public class DojoControllers {
	private final DojoService dojoeService;

	public DojoControllers(DojoService dojoeService) {
		this.dojoeService = dojoeService;
	}
	
	@RequestMapping("/dojos/new")
	public String dojoMain(@ModelAttribute("dojo") Dojo dojo) {
		return "DojoPage.jsp";
	}
	
	@PostMapping("/dojos")
	public String create(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
		 if (result.hasErrors()) {
	            return "/dojos/new";
	        } else {
	        	dojoeService.createDojo(dojo);
	            return "redirect:/dojos/new";
	        }
	    }
	@GetMapping("/dojos/{id}")
	public String tableNinjas(@PathVariable ("id") Long id , Model model) {
		Dojo dojo = dojoeService.findDojo(id);
		model.addAttribute("dojo", dojo);
		return "table.jsp";
	}
	}
	
	
