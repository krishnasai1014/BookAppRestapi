package com.book.Bookapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.book.Bookapp.entity.BookApp;
import com.book.Bookapp.rep.BookRepo;


@Component
public class BookService 
{
	
	// if i want to use bookrepo in the BookSerice we need to use @Autowired
	
	@Autowired
	BookRepo br;

	public List<BookApp> getAllBooks()
	{
		// here it doesn't have getAll method it have the findAll()
		// we are doing cast for this
	return	(List<BookApp>) br.findAll();
		
		
	}

}
