package com.sparta.lh.decorator;

public abstract class Pizza {

    // first build an abstract base class
    private String description;
    private double cost;

    public String getDescription() {
        return description;
    }

    public double getCost() {
        return cost;
    }
}
