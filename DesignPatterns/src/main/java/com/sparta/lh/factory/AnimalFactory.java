package com.sparta.lh.factory;

public class AnimalFactory {

    // factory methods give access to objects but hide how they are created

    // you can customise and create many different kinds of objects (even passing in different agrgument to the same constructor)
    // e.g. passing in "Hound Dog" can return a "Dog" but with a Constructor signature specific to Hound Dog

    // factory methods are typically static
    public static Speakable getAnimal(String animal) {
        // only one of the objects below will be created - that's the 'factory pattern'
        switch (animal) {
            case "Dog" -> {
                return new Dog();
            }
            case "Cat" -> {
                return new Cat();
            }
            case "Goldfish" -> {
                return new Goldfish();
            }
        }

        return null;

    }
}
