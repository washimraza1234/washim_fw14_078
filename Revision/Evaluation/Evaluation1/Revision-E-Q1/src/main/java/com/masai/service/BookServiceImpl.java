package com.masai.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exceptions.BookException;
import com.masai.model.Book;
import com.masai.repository.BookRepo;


@Service
public class BookServiceImpl implements BookService{

	@Autowired
	private BookRepo bookDao;
	
	
	@Override
	public List<Book> findAllBooks() throws BookException {
		List<Book> bList= bookDao.findAll();
		
		if(bList.size() <= 0) {
			throw new BookException("No Books Found.... ");
		}
		else
			return bList;
	}


	@Override
	public Book getBookById(Integer id) throws BookException {
		Optional<Book> book= bookDao.findById(id);
		
		if(book.isPresent()) {
			return book.get();
		}
		else {
			throw new BookException("No books available with ID :"+id);
		}
	}


	@Override
	public Book addBook(Book book) throws BookException {
		Book b= bookDao.save(book);
		
		if(b != null)
			return b;
		
		else
			throw new BookException("No books are added");
	}


	@Override
	public Book deleteBookById(Integer id) throws BookException {
		Optional<Book> book= bookDao.findById(id);
		
		if(book.isPresent()) {
			Book existingBook= book.get();
			bookDao.delete(existingBook);
			return existingBook;
		}
		else
			throw new BookException("Book Not Available with id :"+id);
	}


	@Override
	public Book updateBook(Book book) throws BookException {
		Optional<Book> bk= bookDao.findById(book.getId());
		
		if(bk.isPresent()) {
			Book updatedBook= bookDao.save(book);
			return updatedBook;
		}
		
		else
			throw new BookException("Books not updated");
	}

}
