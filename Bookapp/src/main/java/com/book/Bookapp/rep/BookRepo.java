package com.book.Bookapp.rep;

import org.springframework.data.repository.CrudRepository;

import com.book.Bookapp.entity.BookApp;



public interface BookRepo  extends CrudRepository<BookApp,Integer>
{
	

}
