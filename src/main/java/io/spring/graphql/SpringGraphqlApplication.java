package io.spring.graphql;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.spring.graphql.entity.Book;
import io.spring.graphql.service.BookService;

@SpringBootApplication
public class SpringGraphqlApplication {
	
	@Autowired
	private BookService bookService;

	public static void main(String[] args) {
		SpringApplication.run(SpringGraphqlApplication.class, args);
	}
	
	@PostConstruct
	public void initializeDB() {
		
		Book book1 = new Book();
		book1.setId(1);
		book1.setTitle("Java Complete reference");
		book1.setAuthor("Vijay Kumar");
		book1.setDesc("Java Basic concept for students only");
		book1.setPages(300);
		book1.setPrice(550.00);
		
		Book book2 = new Book();
		book2.setId(2);
		book2.setTitle("Data Structure & Algorithms");
		book2.setAuthor("Jane Doe");
		book2.setDesc("Algorith design for students only");
		book2.setPages(450);
		book2.setPrice(900.00);
		
		
		bookService.addBook(book1);
		bookService.addBook(book2);
		
	}

}
