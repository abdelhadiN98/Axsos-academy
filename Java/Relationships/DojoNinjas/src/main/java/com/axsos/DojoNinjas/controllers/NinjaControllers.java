package com.axsos.DojoNinjas.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.axsos.DojoNinjas.models.Dojo;
import com.axsos.DojoNinjas.models.Ninja;
import com.axsos.DojoNinjas.services.DojoService;
import com.axsos.DojoNinjas.services.NinjaService;



@SpringBootApplication
@Controller

public class NinjaControllers {
	private final NinjaService ninjaeService;
	private final DojoService dojoeService;


	
	public NinjaControllers(NinjaService ninjaeService, DojoService dojoeService) {
		this.ninjaeService = ninjaeService;
		this.dojoeService = dojoeService;
	}



	@GetMapping("/ninjas/new")
	public String ninjaMain(Model model ,@ModelAttribute("ninja") Ninja ninja){
		List<Dojo> dojo = dojoeService.allDojos();
		model.addAttribute("dojo", dojo);
		return "ninjaPage.jsp";
	}
	@PostMapping("/ninjas")
	public String ninjaForm(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result) {
		 if (result.hasErrors()) {
	            return "/ninjas/new";
	        } else {
	        	ninjaeService.createNinja(ninja);
	            return "redirect:/ninjas/new";
	        }
	}

}
