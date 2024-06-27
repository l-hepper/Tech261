package com.sparta.lh.singleton;

public class SingletonExample {
    // store private, static, final Singleton
    private static final SingletonExample SINGLETON_EXAMPLE = new SingletonExample();

    // first, hide the default constructor, do not allow any other classes to make an object of this type
    private SingletonExample() {}

    // single static method to return the singleton object
    public static SingletonExample getSingletonExample() {
        if (SINGLETON_EXAMPLE == null) {
            return new SingletonExample();
        }
        return SINGLETON_EXAMPLE;
    }
}
