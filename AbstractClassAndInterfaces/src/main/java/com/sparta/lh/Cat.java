package com.sparta.lh;

public class Cat extends Animal {

    public Cat(String name, String breed, int age) {
        super(name, breed, age);
    }

    @Override
    public void play() {
        System.out.println(super.getName() + " wants to play like a CAT.");
    }

    @Override
    public void drinks() {
        System.out.println(super.getName() + " is drinking like a cat.");
    }
}
