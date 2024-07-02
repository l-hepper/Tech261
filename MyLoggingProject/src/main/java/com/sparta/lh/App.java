package com.sparta.lh;

import com.sparta.lh.logger.ProjectLogger;

import java.sql.SQLOutput;
import java.util.logging.Logger;

public class App {


    public static void main(String[] args) {
        ProjectLogger.configure();



        Coffee coffee = new Coffee("Arabica", 30);

        coffee.getTemperature();

    }
}
