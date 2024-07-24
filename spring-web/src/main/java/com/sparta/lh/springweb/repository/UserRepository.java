package com.sparta.lh.springweb.repository;

import com.sparta.lh.springweb.entities.Book;
import com.sparta.lh.springweb.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

  Optional<User> findUserByUserName(String userName);

}