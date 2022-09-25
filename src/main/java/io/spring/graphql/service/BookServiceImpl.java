package io.spring.graphql.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.spring.graphql.entity.Book;
import io.spring.graphql.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService {
	
	@Autowired
	private BookRepository bookRepository;

	@Override
	public Book addBook(Book book) {
		return bookRepository.save(book);
	}

	@Override
	public List<Book> getAllBooks() {
		return bookRepository.findAll();
	}

	@Override
	public Book getBook(int bookId) {
		return bookRepository.findById(bookId).orElseThrow(()->new RuntimeException("Book with bookId : "+ bookId + " not found!!"));
	}

}
