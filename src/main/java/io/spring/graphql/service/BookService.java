package io.spring.graphql.service;

import java.util.List;

import io.spring.graphql.entity.Book;

public interface BookService {
	
	// Create a book object
	public Book addBook(Book book);
	
	//Gets all the books
	public List<Book> getAllBooks();
	
	
	// Gets single Book
	public Book getBook(int bookId);

}
