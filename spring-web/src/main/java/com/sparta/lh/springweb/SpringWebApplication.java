package com.sparta.lh.springweb;

import com.sparta.lh.springweb.entities.User;
import com.sparta.lh.springweb.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class SpringWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringWebApplication.class, args);
    }

//    @Bean
//    CommandLineRunner runner(UserRepository userRepository, PasswordEncoder passwordEncoder) {
//        return args -> {
//          userRepository.save(new User("admin", passwordEncoder.encode("password"), "ROLE_ADMIN"));
//          userRepository.save(new User("user", passwordEncoder.encode("password"), "ROLE_USER"));
//        };
//    }

}
