package com.sparta.lh.springjpa;

import com.sparta.lh.springjpa.entities.AuthorEntity;
import com.sparta.lh.springjpa.repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import java.util.logging.Logger;

@SpringBootApplication
public class SpringJpaApplication {

    private static final Logger logger = Logger.getLogger(SpringJpaApplication.class.getName());

    public static void main(String[] args) {
        SpringApplication.run(SpringJpaApplication.class, args);

    }


    // go find something that implements this interface and implement this method on it
    // Higher than bean is to inject a whole class.
    // The order of components (components have a certain level of priority)
    // Spring will prioritise classes before beans
    @Bean // bean represents an object that spring will create. BEAN is the lowest level of dependency injection
    public CommandLineRunner runner(AuthorRepository repo) {
        // args is the parameter that comes from the run method in CommandLineRunner
        // below here is an anonymous inner class
//        repo.save(new AuthorEntity("Daniel LaRusso"));
//        repo.save(new AuthorEntity("Terry Silver"));
        return args -> {
            System.out.println("Finding: " + repo.findByFullName("Liam Hepper"));
            logger.info(repo.findAll().toString());
        };
    }
}
