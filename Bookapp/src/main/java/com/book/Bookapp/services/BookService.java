package com.book.Bookapp.services;

import java.util.List;
import java.util.Optional;

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

	public BookApp getBook(int bid)
	{
		
		return br.findById(bid);
	}

	public String  insertBook(BookApp b) 
	{
		
		br.save(b);
		
		return " Book Added";
	
		
	}

	public String  deleteBook(int bid) 
	{
	  BookApp book = br.findById(bid);
	  
	  if(book!=null)
	  {
		  br.delete(book);
		  return "book deleted successfully";
	  }
	  else
	  {
		  return "Book has not Founded";
	  }
		
				
	}

	public String  updateBook(int bid, BookApp b) 
	{
		if(br.findById(bid)!=null)
		{
			br.save(b);
			return "Book Details has been updated";
		}
		else
		{
			return "Book  not updated";
		}
				
		}
		
		
	}


