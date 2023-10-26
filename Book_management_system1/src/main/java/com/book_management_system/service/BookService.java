package com.book_management_system.service;

//Import statement for the List interface
import java.util.List;

//Import statement for the Optional class
import java.util.Optional;

//Import statement for the Book entity class
import com.book_management_system.entity.Book;

//Declaration of the BookService interface
public interface BookService {
	
	// Method signature to retrieve all books
	List<Book> getAllBooks();

	// Method signature to retrieve a book by its ID
	Optional<Book> getBookById(int id);

	// Method signature to create a new book
	Book createBook(Book book);

	// Method signature to add a list of books
	List<Book> addAllbook(List<Book> book);

	// Method signature to update a book by its ID
	Book updateBook(int id, Book book);

	// Method signature to delete a book by its ID
	String deleteBook(int id);
}