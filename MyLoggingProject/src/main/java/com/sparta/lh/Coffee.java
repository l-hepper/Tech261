package com.sparta.lh;

import com.sparta.lh.logger.ProjectLogger;

import java.util.logging.Logger;

public class Coffee {

    private static final Logger logger = Logger.getLogger("testing another name");

    private String origin;
    private int temperature;

    public Coffee(String origin, int temperature) {
        this.origin = origin;
        this.temperature = temperature;
        logger.info("Coffee object created");
    }

    public int getTemperature() {
        logger.info("getTemperature has been called");
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }
}
