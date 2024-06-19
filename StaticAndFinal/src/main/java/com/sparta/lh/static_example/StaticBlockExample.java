package com.sparta.lh.static_example;

import java.util.ArrayList;

public class StaticBlockExample {
    private static ArrayList<String> names = new ArrayList<>();

    static {
        names.add("Alex");
        names.add("Manish");
        System.out.println(names);
        staticMethod();
    }

    public static void staticMethod() {
        System.out.println("Do something.");
    }

}
