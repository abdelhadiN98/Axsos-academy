package com.axsos.mvc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.axsos.mvc.models.Book;
import com.axsos.mvc.services.BookService;

@Controller

public class Test {
    

	@Autowired 
	BookService bookService;
	
	
//    public Test() {
//		
//	}
//	public Test(BookService bookService) {
//        this.bookService = bookService;
//    }
	@GetMapping ("/books/{bookId}")
	public String Welcome(Model model ,@PathVariable("bookId") Long bookId) {
		Book book = bookService.findBook(bookId);
		model.addAttribute("book" , book);
		
		return "index.jsp";
	}
	
    @RequestMapping("/books")
    public String index(Model model) {
        List<Book> books = bookService.allBooks();
        model.addAttribute("books", books);
        return "table.jsp";
    }
	
	
}
