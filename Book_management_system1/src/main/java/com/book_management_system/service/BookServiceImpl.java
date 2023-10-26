package com.book_management_system.service;


//Import statement for the List interface
import java.util.List;

//Import statement for the Optional class
import java.util.Optional;

//Import statements for Spring Framework annotations
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//Import statements for the Book entity class and the BookRepository interface
import com.book_management_system.entity.Book;
import com.book_management_system.repository.BookRepository;

//Annotation indicating that this class is a Spring Service
@Service
public class BookServiceImpl implements BookService {

	// Autowired field for the BookRepository
	@Autowired
	BookRepository bookrepository;

	// Implementation of the 'getAllBooks' method
	@Override
	public List<Book> getAllBooks() {
		return bookrepository.findAll();
	}

	// Implementation of the 'getBookById' method
	@Override
	public Optional<Book> getBookById(int id) {
		Optional<Book> bookid = bookrepository.findById(id);
		return bookid;
	}

	// Implementation of the 'createBook' method
	@Override
	public Book createBook(Book book) {
		return bookrepository.save(book);
	}

	// Implementation of the 'addAllbook' method
	@Override
	public List<Book> addAllbook(List<Book> book) {
		return bookrepository.saveAll(book);
	}

	// Implementation of the 'updateBook' method
	@Override
	public Book updateBook(int id, Book book) {
		// Retrieve the existing book by its ID
		Book bookupdate = bookrepository.findById(id).get();
		// Update the title and author of the book
		bookupdate.setTitle(book.getTitle());
		bookupdate.setAuthor(book.getAuthor());

		// Save the updated book
		Book bookud1 = bookrepository.save(bookupdate);

		return bookud1;
	}

	// Implementation of the 'deleteBook' method
	@Override
	public String deleteBook(int id) {
		// Delete the book by its ID
		bookrepository.deleteById(id);
		// Return a success message
		return "Book Deleted Successfully!!";
	}
}