package br.com.book.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.book.entity.Book;

public interface BookRepository extends CrudRepository<Book, Long>{
  
  List<Book> findAll();

}
