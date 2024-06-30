package com.liam.h;

public class SingletonExample {

    // a private static variable to hold the instance of this class (and it belongs to this class)
    private static SingletonExample instance;

    // a private constructor with no body to overwrite the default constructor
    private SingletonExample() {};

    // a method to return the singular instance with a check for null if this is the first time the logger is called
    public SingletonExample getSingleton() {
        if (instance == null) {
            instance = new SingletonExample();
        }

        return instance;
    }
}
