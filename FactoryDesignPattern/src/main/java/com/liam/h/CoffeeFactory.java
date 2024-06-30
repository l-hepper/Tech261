package com.liam.h;

public class CoffeeFactory {

    public static Coffee getCoffee(String coffeeType) {
        switch (coffeeType) {
            case "Americano" -> {
                return new Americano();
            }
            case "Cappuccino" -> {
                return new Cappuccino();
            }
            case "Latte" -> {
                return new Latte();
            }
            default -> {
                throw new UnsupportedOperationException("Not a valid coffee type.");
            }
        }


    }
}
