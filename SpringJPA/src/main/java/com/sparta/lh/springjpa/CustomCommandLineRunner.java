package com.sparta.lh.springjpa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component  // creating a custom component for spring to take care of
public class CustomCommandLineRunner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello from CustomCommandLineRunner");
    }
    // commandline runner helps to read the log files and print out the information (IT IS NOT THE HANDLER IT IS MUCH LOWER LEVEL)
    // AND IT IS NOT AS SOPHISTICATED AS A HANDLER

}
