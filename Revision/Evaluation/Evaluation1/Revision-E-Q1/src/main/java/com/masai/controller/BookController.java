package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exceptions.BookException;
import com.masai.model.Book;
import com.masai.service.BookService;

@RestController
@RequestMapping("/bookservice")
public class BookController {

	@Autowired
	private BookService bService;

	@GetMapping("/books")
	public ResponseEntity<List<Book>> findAllBookHandler() throws BookException{
		List<Book> books= bService.findAllBooks();
		return new ResponseEntity<List<Book>>(books,HttpStatus.OK);
	}
	
	@GetMapping("/books/{bid}")
	public ResponseEntity<Book> findBookbyIDHandler(@PathVariable("bid") Integer id) throws BookException{
		Book book= bService.getBookById(id);
		
		return new ResponseEntity<Book>(book,HttpStatus.FOUND);
	}
	
	@PostMapping("/books")
	public ResponseEntity<Book> addBookHandler(@RequestBody Book book) throws BookException{
		Book bk= bService.addBook(book);
		
		return new ResponseEntity<Book>(bk,HttpStatus.FOUND);
	}
	
	@DeleteMapping("/books/{bid}")
	public ResponseEntity<Book> deleteBookbyIDHandler(@PathVariable("bid") Integer id) throws BookException{
		Book book= bService.deleteBookById(id);
		
		return new ResponseEntity<Book>(book,HttpStatus.FOUND);
	}
	
	@PutMapping("/books/{bid}")
	public ResponseEntity<Book> updateBookHandler(@RequestBody Book book) throws BookException{
		Book bk= bService.updateBook(book);
		
		return new ResponseEntity<Book>(bk,HttpStatus.FOUND);
	}
	
	
	
	

}
