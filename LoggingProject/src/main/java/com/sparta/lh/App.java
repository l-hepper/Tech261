package com.sparta.lh;

import java.io.IOException;
import java.util.logging.*;

public class App {

    private static final Logger logger = Logger.getLogger(App.class.getName());

    public static void main(String[] args) {


        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.ALL);

        // there is simple formatter and XML formatter
        consoleHandler.setFormatter(new XMLFormatter());

        logger.addHandler(consoleHandler);


        // basically a more advanced print statement
        //logger.log(Level.INFO, "this is an info message");

        // shorthand version
        logger.setLevel(Level.ALL);
        // why don't you see anything now that setLevel is Level.ALL?
        // because the handler also has levels.



        logger.setUseParentHandlers(false); // this means the logger won't do anything
        logger.info("this is an info message");
        logger.warning("this is a warning message");
        logger.fine("this is a fine message");


        // takes in a filepath to write the logs to
        try {
            FileHandler fileHandler = new FileHandler("src/main/resources/logfile.log");
            fileHandler.setLevel(Level.ALL);
            fileHandler.setFormatter(new CustomFormatter());
            logger.addHandler(fileHandler);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
