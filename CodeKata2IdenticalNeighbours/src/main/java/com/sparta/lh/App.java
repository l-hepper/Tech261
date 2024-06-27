package com.sparta.lh;

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.*;

public class App {

    private static final Logger logger = Logger.getLogger(App.class.getName());

    public static void main(String[] args) {
        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.ALL);

        // there is simple formatter and XML formatter
        consoleHandler.setFormatter(new SimpleFormatter());
        logger.addHandler(consoleHandler);
        logger.setLevel(Level.ALL);
        logger.setUseParentHandlers(false); // this means the logger won't do anything

        try {
            FileHandler fileHandler = new FileHandler("src/main/resources/logfile.log");
            fileHandler.setLevel(Level.ALL);
            fileHandler.setFormatter(new XMLFormatter());
            logger.addHandler(fileHandler);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        int[] array1 = {1, 2, 3, 4, 5};
        hasThreeIdenticalNeighbours(array1);

        int[] array2 = {1, 1, 1, 4, 5};
        hasThreeIdenticalNeighbours(array2);
    }

    public static boolean hasThreeIdenticalNeighbours(int[] numbers) {
        logger.info("called with argument " + Arrays.toString(numbers));

        if (numbers.length < 3) {
            logger.info("array.length < 3 - return FALSE");
            return false;
        }

        for (int i = 2; i < numbers.length; i++) {
            if (numbers[i] == numbers[i-1] && numbers[i] == numbers[i-2]) {
                logger.fine("neighbours found - return TRUE");
                return true;
            }
        }

        logger.info("no neighbours found - return FALSE");
        return false;
    }
}


