package com.sparta.lh;

public class App {
    public static void main(String[] args) {

        Skill sword = new Skill("Sword");
        Skill crossbow = new Skill("Crossbow");

        System.out.println(sword);
        System.out.println(crossbow);

        sword.increaseRank();
        System.out.println(sword);

        sword.increaseRank();
        System.out.println(sword);

    }
}
