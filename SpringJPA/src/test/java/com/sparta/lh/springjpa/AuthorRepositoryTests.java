package com.sparta.lh.springjpa;

import com.sparta.lh.springjpa.entities.AuthorEntity;
import com.sparta.lh.springjpa.entities.BookEntity;
import com.sparta.lh.springjpa.repositories.AuthorRepository;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

// springboot test means run and stay running (the application will keep running because it is hosting a back-end)
@Transactional
@SpringBootTest
class AuthorRepositoryTests {

    // spring always says to auto wire on constructors? I think:: but it can be done on fields too
    // get spring to create the repository for you - get spring to do the dependency injection on a specific field
    @Autowired
    AuthorRepository repository;

    @Test
    void testFindByFullName() {
        repository.save(new AuthorEntity("Eli Moskowitz"));
        List<AuthorEntity> authors = repository.findByFullName("Eli Moskowitz");
        Assertions.assertEquals(authors.getFirst().getFullName(), "Eli Moskowitz");
    }

    @Test
    void testFindByFullNameLike() {
        List<AuthorEntity> authors = repository.findByFullNameLike("%Johnny%");
        Assertions.assertEquals(2, authors.size());
    }

    @Test
    void testFindByIdNotIn() {
        List<AuthorEntity> authors = repository.findByIdNotIn(new ArrayList<>(List.of(1, 2, 7)));
        Assertions.assertEquals(3, authors.size());
    }

    @Test
    void testSavingNewAuthor() {
        AuthorEntity author = new AuthorEntity("Mike Barnes");
        repository.save(author);
        Optional<AuthorEntity> foundAuthor = repository.findById(author.getId());
        Assertions.assertEquals("Mike Barnes", foundAuthor.get().getFullName());
    }

    @Test
    void testUpdateFullName() {
        repository.updateFullName("Liam Hepper");
        Optional<AuthorEntity> foundAuthor = repository.findById(1);
        Assertions.assertEquals("Tolkein", foundAuthor.get().getFullName());
    }
}
