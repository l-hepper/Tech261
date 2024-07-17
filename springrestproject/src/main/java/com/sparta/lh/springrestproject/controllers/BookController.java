package com.sparta.lh.springrestproject.controllers;

import com.sparta.lh.springrestproject.entities.Book;
import com.sparta.lh.springrestproject.exceptions.ResourceNotFoundException;
import com.sparta.lh.springrestproject.repositories.AuthorRepository;
import com.sparta.lh.springrestproject.repositories.BookRepository;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.http.HttpResponse;
import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {

    private final BookRepository bookRepository;
    private final AuthorRepository authorRepository;

    @Autowired
    public BookController(BookRepository bookRepository, AuthorRepository authorRepository) {
        this.bookRepository = bookRepository;
        this.authorRepository = authorRepository;
    }

    @GetMapping("")
    public List<Book> getBooks() {
        return bookRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable Integer id) {
        Book book = bookRepository.findById(id).orElse(null);
        if (book == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(book, HttpStatus.OK);
    }

    @PostMapping("")
    public ResponseEntity<Book> addBook(@RequestBody Book book, HttpServletRequest request) {
        if (book.getAuthor().getId() == null) {
            authorRepository.save(book.getAuthor());
        } else if (!authorRepository.existsById(book.getAuthor().getId())) {
            throw new ResourceNotFoundException("Author with id " + book.getAuthor().getId() + " not found.");
        }

        bookRepository.save(book);
        URI location = URI.create(request.getRequestURL().toString() + "/" + book.getId());
        return new ResponseEntity<>(book, HttpStatus.CREATED);
    }


}
