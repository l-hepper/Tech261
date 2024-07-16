package com.sparta.lh.springrestproject.repositories;

import com.sparta.lh.springrestproject.entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Integer> {
}