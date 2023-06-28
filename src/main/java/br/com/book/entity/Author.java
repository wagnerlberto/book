package br.com.book.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name="author")
@Entity(name="author")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Author {

  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  /*private*/ public Long id;
  
  @Column(name="name")
  public String name;
  
//  public Author(String name) {
//    this.name = name;
//  }
}
