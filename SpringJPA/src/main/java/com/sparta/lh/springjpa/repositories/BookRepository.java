package com.sparta.lh.springjpa.repositories;

import com.sparta.lh.springjpa.entities.AuthorEntity;
import com.sparta.lh.springjpa.entities.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<BookEntity, Integer> {

    List<BookEntity> findByTitle(String title);

    List<BookEntity> findByTitleLike(String title);

    List<BookEntity> findByAuthor(AuthorEntity author);

    List<BookEntity> findByAuthor_FullName(String fullName);

    List<BookEntity> findByAuthor_FullNameAndTitle(String name, String title);

}