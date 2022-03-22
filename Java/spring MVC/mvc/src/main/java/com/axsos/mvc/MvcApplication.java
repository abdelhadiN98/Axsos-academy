package com.axsos.mvc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.axsos.mvc.models.Book;
import com.axsos.mvc.services.BookService;

@SpringBootApplication
//@Controller
public class MvcApplication {
//	@Autowired
//	BookService bookService ; 
//	@RequestMapping("/")
//	public String welcome(Model model) {
//		
//		List <Book> book = bookService.allBooks();
//		model.addAttribute("book" , book);
//		
//		return "index.jsp";
//	}

	public static void main(String[] args) {
		SpringApplication.run(MvcApplication.class, args);
	}

}
