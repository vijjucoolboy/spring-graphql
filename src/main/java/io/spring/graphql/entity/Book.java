package io.spring.graphql.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Book {
	
	@Id
	private int id;
	private String title;
	private String desc;
	private String author;
	private double price;
	private int pages;

}
