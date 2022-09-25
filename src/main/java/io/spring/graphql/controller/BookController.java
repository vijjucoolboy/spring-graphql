package io.spring.graphql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import io.spring.graphql.entity.Book;
import io.spring.graphql.entity.BookInput;
import io.spring.graphql.service.BookService;


@Controller
public class BookController {
	
	@Autowired
	private BookService bookService;

	@MutationMapping("createBook")
	public Book addBook(@Argument BookInput book) {
		
		Book book1 = new Book();
		book1.setId(book.getId());
		book1.setAuthor(book.getAuthor());
		book1.setDesc(book.getDesc());
		book1.setPages(book.getPages());
		book1.setPrice(book.getPrice());
		book1.setTitle(book.getTitle());
		
		return bookService.addBook(book1);
	}
	

	@QueryMapping("allBooks")
	public List<Book> getAllBooks(){
		
		return bookService.getAllBooks();
	}
	
	@QueryMapping("getBook")
	public Book getBook(@Argument int bookId) {
		
		return bookService.getBook(bookId);
	}

}
