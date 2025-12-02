package com.book.Bookapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.book.Bookapp.entity.BookApp;
import com.book.Bookapp.services.BookService;

@RestController
public class BookController
{
	//It will perform the crud operations  here if we want use the bookcontroller we need to use the bookservice by using @Autowire we can inject the bookserive here it self

	
	@Autowired
	BookService bs;
	
	@GetMapping("/getAllBooks")
	List<BookApp> getAllBooks()
	{
		// here we add this method in the BookService
    return bs.getAllBooks();
	}
	
	

//	@GetMapping("/book")
//	 List<BookApp> getAllBook()
//	{
//	return bs.getAllBooks();
//	}
	
	
}
