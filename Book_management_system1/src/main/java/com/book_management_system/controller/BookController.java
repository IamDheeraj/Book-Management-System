package com.book_management_system.controller;
//Import statements for various Spring Framework components
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

//Import statements for the Book entity class and the BookService interface
import com.book_management_system.entity.Book;
import com.book_management_system.service.BookService;

//Annotation indicating that this class is a Spring REST Controller
@RestController

//Request mapping to define the base URL for this controller
@RequestMapping("/api")
public class BookController {

	// Autowired field for the BookService
	@Autowired
	BookService bookservice;

	// Request mapping for creating a book via POST request
	@PostMapping("/createbook")
	ResponseEntity<Book> createbook(@RequestBody Book book) {
		// Return a response entity with the created book and HTTP status code CREATED
		return new ResponseEntity<Book>(bookservice.createBook(book), HttpStatus.CREATED);
	}

	// Request mapping for adding a list of books via POST request
	@PostMapping("/addAllbook")
	ResponseEntity<List<Book>> addallbook(@RequestBody List<Book> book) {
		// Add a list of books and return a response entity with the added books and HTTP status code CREATED
		List<Book> addbook = bookservice.addAllbook(book);
		return new ResponseEntity<List<Book>>(addbook, HttpStatus.CREATED);
	}

	// Request mapping for getting all books via GET request
	@GetMapping("/getAllBooks")
	@ResponseStatus(HttpStatus.FOUND)
	List<Book> getAllbook() {
		// Retrieve and return a list of all books
		return bookservice.getAllBooks();
	}

	// Request mapping for getting a book by its ID via GET request
	@GetMapping("/getBookById/{b_id}")
	@ResponseStatus(HttpStatus.FOUND)
	Optional<Book> getBookById(@PathVariable("b_id") int id) {
		// Retrieve and return a book by its ID
		return bookservice.getBookById(id);
	}

	// Request mapping for updating a book by its ID via PUT request
	@PutMapping("/updateBook/{b_id}")
	@ResponseStatus(HttpStatus.ACCEPTED)
	Book updateBook(@PathVariable("b_id") int id, @RequestBody Book book) {
		// Update and return the updated book
		return bookservice.updateBook(id, book);
	}

	// Request mapping for deleting a book by its ID via DELETE request
	@DeleteMapping("/deleteBook/{b_id}")
	@ResponseStatus(HttpStatus.GONE)
	String deleteBook(@PathVariable("b_id") int id) {
		// Delete the book by its ID and return a success message
		return bookservice.deleteBook(id);
	}
}