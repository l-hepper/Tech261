package com.sparta.lh.springjpa.repositories;

import com.sparta.lh.springjpa.entities.AuthorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

// repo takes in two generic types - one is the entity, and the other is the primary key of the database
@Repository
public interface AuthorRepository extends JpaRepository<AuthorEntity, Integer> {

    @Query(value="SELECT * FROM authors WHERE full_name = ?1", nativeQuery=true)
    List<AuthorEntity> findByFullName(String name);

    @Query(value ="SELECT * FROM authors WHERE full_name LIKE ?1", nativeQuery=true)
    List<AuthorEntity> findByFullNameLike(String name);

    @Query(value="SELECT * FROM authors WHERE author_id NOT IN (:ids)", nativeQuery = true)
    List<AuthorEntity> findByIdNotIn(List<Integer> ids);

    @Modifying
    @Query(value="UPDATE authors SET full_name = 'Tolkein' WHERE full_name = ?1", nativeQuery=true)
    void updateFullName(String name);

}
