package com.sparta.lh.springjpa.service;

import com.sparta.lh.springjpa.entities.AuthorEntity;
import com.sparta.lh.springjpa.entities.BookEntity;
import com.sparta.lh.springjpa.repositories.AuthorRepository;
import com.sparta.lh.springjpa.repositories.BookRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LibraryService {

    // field injection is not recommended??
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    @Autowired
    public LibraryService(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    // write a method that returns a list of all authors with only one book
    @Transactional
    public List<AuthorEntity> getAuthorsWithOneBook() {
        List<AuthorEntity> authorsWithOneBook = new ArrayList<>();

        List<AuthorEntity> authors = authorRepository.findAll();
        for (AuthorEntity author : authors) {
            List<BookEntity> books = bookRepository.findByAuthor(author);
            if (books.size() == 1) {
                authorsWithOneBook.add(author);
            }
        }

        return authorsWithOneBook;
    }


}
