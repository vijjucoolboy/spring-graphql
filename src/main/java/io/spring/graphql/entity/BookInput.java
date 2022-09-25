package io.spring.graphql.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookInput {
	
	private int id;
	private String title;
	private String desc;
	private String author;
	private double price;
	private int pages;

}
