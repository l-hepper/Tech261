package com.sparta.lh;

public interface Sleepable {
    void sleeps();

    default void print() {
        System.out.println("This is printing something from a default method in Sleepable.");
    }

    public static void printingHelper() {
        System.out.println("Let's print this out!");
    }
}
