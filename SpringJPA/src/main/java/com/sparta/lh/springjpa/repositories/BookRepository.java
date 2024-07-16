package com.sparta.lh.springjpa.repositories;

import com.sparta.lh.springjpa.entities.AuthorEntity;
import com.sparta.lh.springjpa.entities.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<BookEntity, Integer> {

    @Query(value = "SELECT * FROM books WHERE title = ?1", nativeQuery = true)
    List<BookEntity> findByTitle(String title);

    @Query(value = "SELECT * FROM books WHERE title LIKE ?1", nativeQuery = true)
    List<BookEntity> findByTitleLike(String title);

//    @Query(value = "SELECT * FROM books WHERE author_id = ?1", nativeQuery = true)
    List<BookEntity> findByAuthor_Id(int authorID);

    List<BookEntity> findByAuthor(AuthorEntity author);

//    @Query(value ="SELECT books.* FROM books JOIN authors ON books.author_id = authors.author_id WHERE authors.full_name = ?1", nativeQuery = true)
    List<BookEntity> findByAuthor_FullName(String fullName);

}