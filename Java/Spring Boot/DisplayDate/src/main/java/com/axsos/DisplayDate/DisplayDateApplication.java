package com.axsos.DisplayDate;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
public class DisplayDateApplication {
	@RequestMapping("")
	public String Display() {
		return "Display.jsp";
	}
	@RequestMapping("/date")
	public String Date(Model model) {
		LocalDateTime myDateObj = LocalDateTime.now();
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("E, MMM dd yyyy");
		 String formattedDate = myDateObj.format(myFormatObj);
		 model.addAttribute("date", formattedDate);
		return "Date.jsp";
	}
	@RequestMapping("/time")
	public String Time(Model model) {
		LocalDateTime myDateObj = LocalDateTime.now();
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("HH:mm");
		 String formattedTime = myDateObj.format(myFormatObj);
		 model.addAttribute("time", formattedTime);
		return "Time.jsp";
	}

	public static void main(String[] args) {
		SpringApplication.run(DisplayDateApplication.class, args);
	}

}
