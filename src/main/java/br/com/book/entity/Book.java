package br.com.book.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name="book")
@Entity(name="book")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Book {

  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private Long id;
  
//  @NotBlank
  @Column(name="name")
  private String name;
  
  @ManyToOne
  @JoinColumn(name="author_id")
  private Author author;
  
//  public Book(String name, Author author) {
//    this.name=name;
//    this.author=author;
//  }
}
