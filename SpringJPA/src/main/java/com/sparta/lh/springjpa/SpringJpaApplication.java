package com.sparta.lh.springjpa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringJpaApplication.class, args);
    }


    // go find something that implements this interface and implement this method on it
    @Bean // bean represents an object that spring will create. BEAN is the lowest level of dependency injection
    // Higher than bean is to inject a whole class.
    // The order of components (components have a certain level of priority)
    // Spring will prioritise classes before beans
    public CommandLineRunner runner() {
        // args is the parameter that comes from the run method in CommandLineRunner
        // below here is an anonymous inner class
        return args -> {
            System.out.println("Hello from CommandLineRunner");
        };
    }
}
