package com.book_management_system.entity;
//Annotation indicating that this class is an entity
import javax.persistence.Entity;

//Annotation indicating that the 'id' field will be generated automatically
import javax.persistence.GeneratedValue;

//Enumerated type indicating the generation strategy for 'id' field
import javax.persistence.GenerationType;

//Annotation indicating that the 'id' field is the primary key
import javax.persistence.Id;

//Lombok annotation to generate all-argument constructor
import lombok.AllArgsConstructor;

//Lombok annotation to generate getter and setter methods
import lombok.Data;

//Lombok annotation to generate no-argument constructor
import lombok.NoArgsConstructor;

//The class declaration for the Book entity
@Entity

//Lombok annotation to generate getter and setter methods
@Data

//Lombok annotation to generate all-argument constructor
@AllArgsConstructor

//Lombok annotation to generate no-argument constructor
@NoArgsConstructor
public class Book {
	// The 'id' field is the primary key and will be generated automatically
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	// The 'title' field for the book's title
	private String title;

	// The 'author' field for the book's author
	private String author;
}