package com.book_management_system.repository;

//Import statement for the JpaRepository interface
import org.springframework.data.jpa.repository.JpaRepository;

//Import statement for the Book entity class
import com.book_management_system.entity.Book;

//Declaration of the BookRepository interface that extends JpaRepository
public interface BookRepository extends JpaRepository<Book, Integer> {

}