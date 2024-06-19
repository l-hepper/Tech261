package com.sparta.lh;

public class Dog extends Animal {

    public Dog(String name, String breed, int age) {
        super(name, breed, age);
    }

    public void play(String name) {
        System.out.println(name + " wants to play with " + super.getName());
    }

    @Override
    public void drinks() {
        System.out.println(super.getName() + " is drinking like a dog.");
    }
}
