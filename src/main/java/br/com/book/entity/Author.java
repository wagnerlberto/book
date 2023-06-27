package br.com.book.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="author")
@Entity(name="author")
public class Author {

  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private Long id;
  
  @Column(name="name")
  private String name;
  
  public Author(String name) {
    this.name = name;
  }
}
