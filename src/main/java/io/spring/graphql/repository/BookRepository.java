package io.spring.graphql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.spring.graphql.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{

}
