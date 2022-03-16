package com.axsos.Daikichi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("Daikichi")
public class DaikichiApplication {
	@RequestMapping("")
	public String welcome() {
		return "Welcome !";
	}
	@RequestMapping("/today")
	public String today() {
		return "Today you will find luck !";
	}
	@RequestMapping("/tomorrow")
	public String tomorrow() {
		return "Tomorrow , apportunity will be araise";
	}

	public static void main(String[] args) {
		SpringApplication.run(DaikichiApplication.class, args);
		
	}

}
