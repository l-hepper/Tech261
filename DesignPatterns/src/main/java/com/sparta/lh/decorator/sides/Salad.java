package com.sparta.lh.decorator.sides;

import com.sparta.lh.decorator.Pizza;

public class Salad extends Sides{

    public Salad(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " a salad";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 5;
    }
}
