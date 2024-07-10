package com.sparta.lh.springjpa.repositories;

import com.sparta.lh.springjpa.entities.AuthorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

// repo takes in two generic types - one is the entity, and the other is the primary key of the database
@Repository
public interface AuthorRepository extends JpaRepository<AuthorEntity, Integer> {

    List<AuthorEntity> findByFullName(String name);

    List<AuthorEntity> findByFullNameLike(String name);

    List<AuthorEntity> findByIdNotIn(List<Integer> ids);

}
