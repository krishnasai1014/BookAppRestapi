package com.book.Bookapp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="bookapp")
public class BookApp
{
	
	@Id
	@Column(name ="id")
	int  id ;
	@Column(name ="booktitle")
	String bookTitle;
	@Column(name ="bookauthor")
	String bookAuthor;
	
	
	public BookApp(int id, String bookTitle, String bookAuthor)
	
	{
		super();
		this.id = id;
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
		
		
	}


	public BookApp() {
		super();
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getBookTitle() {
		return bookTitle;
	}


	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}


	public String getBookAuthor() {
		return bookAuthor;
	}


	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}


	@Override
	public String toString() {
		return "BookApp [id=" + id + ", bookTitle=" + bookTitle + ", bookAuthor=" + bookAuthor + "]";
	}
    
	
	
	
	
}
