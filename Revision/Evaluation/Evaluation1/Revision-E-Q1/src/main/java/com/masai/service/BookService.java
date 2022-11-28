package com.masai.service;

import java.util.List;

import com.masai.exceptions.BookException;
import com.masai.model.Book;

public interface BookService {
	
	public List<Book> findAllBooks() throws BookException;
	
	public Book getBookById(Integer id) throws BookException;
	
	public Book addBook(Book book) throws BookException;
	
	public Book deleteBookById(Integer id) throws BookException;
	
	public Book updateBook(Book book) throws BookException ;

}
