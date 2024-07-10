package com.sparta.lh.springjpa;

import com.sparta.lh.springjpa.entities.AuthorEntity;
import com.sparta.lh.springjpa.repositories.AuthorRepository;
import com.sparta.lh.springjpa.repositories.BookRepository;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.sparta.lh.springjpa.entities.BookEntity;
import java.util.List;
import java.util.Optional;

@Transactional
@SpringBootTest
public class BookRepositoryTests {

    @Autowired
    AuthorRepository authorRepository;

    @Autowired
    BookRepository bookRepository;

    @Test
    void testFindByAuthor() {
        Optional<AuthorEntity> author = authorRepository.findById(1);
        List<BookEntity> books = bookRepository.findByAuthor(author.get());
        Assertions.assertEquals(books.size(), 4);
    }

    @Test
    void testFindByAuthor_FullName() {
        List<BookEntity> books = bookRepository.findByAuthor_FullName("Johnny Lawrence");
        Assertions.assertEquals(books.size(), 4);
    }

    @Test
    void testFindByTitle() {
        List<BookEntity> books = bookRepository.findByTitle("The Silent Echo");
        Assertions.assertEquals(books.size(), 1);
    }

    @Test
    void testFindByAuthorAndTitle() {
        List<BookEntity> books = bookRepository.findByAuthor_FullNameAndTitle("Liam Hepper", "The Silent Echo");
        Assertions.assertEquals(books.size(), 1);
    }

    @Test
    void testFindByAuthorAndTitleReturnsEmptyList() {
        List<BookEntity> books = bookRepository.findByAuthor_FullNameAndTitle("Liam Hepper", "Call of the Wild");
        Assertions.assertEquals(books.size(), 0);
    }
}
