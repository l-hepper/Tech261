package com.sparta.lh.logger;

import java.io.IOException;
import java.util.logging.*;

public class ProjectLogger {
    public static void configure() {
        Logger rootLogger = Logger.getLogger("");

        for (var handler : rootLogger.getHandlers()) {
            rootLogger.removeHandler(handler);
        }

//        ConsoleHandler consoleHandler = new ConsoleHandler();
//        consoleHandler.setLevel(Level.ALL);
//        consoleHandler.setFormatter(new SimpleFormatter());
//        logger.addHandler(consoleHandler);

        try {
            FileHandler fileHandler = new FileHandler("src/main/resources/mylogfileywiley.log");
            fileHandler.setLevel(Level.ALL);
            fileHandler.setFormatter(new SimpleFormatter());
            rootLogger.addHandler(fileHandler);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
