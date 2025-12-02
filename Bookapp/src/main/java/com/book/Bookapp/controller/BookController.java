package com.book.Bookapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@GetMapping("/book")
	List<BookApp> getAllBooks()
	{
		// here we add this method in the BookService
    return bs.getAllBooks();
	}
	
	
	@GetMapping("/book/{id}")
	BookApp getBook(@PathVariable("id") int bid)
	{
	return 	bs.getBook(bid);
	}
	
	
	@PostMapping("/book")
	
	String  insertBook(@RequestBody BookApp b)
	{
		return  bs.insertBook(b);
	}
	
	@DeleteMapping("/book/{id}")
	String  deleteBook(@PathVariable("id")int bid)
	{
		return  bs.deleteBook(bid);
	}
	
	
	@PutMapping("/book/{id}")
	 String  updateBook(@PathVariable("id")int bid, @RequestBody BookApp b)
	 {
		return  bs.updateBook(bid,b);
	 }
}
