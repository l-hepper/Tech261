package com.sparta.lh.decorator.sides;

import com.sparta.lh.decorator.Pizza;

// here is an abstract class that takes another abstract class as a field variable (which is a tell tale decorator pattern flag)
public abstract class Sides extends Pizza {

    protected Pizza pizza;

    public Sides(Pizza pizza) {
        this.pizza = pizza;
    }

    public abstract String getDescription();
}
