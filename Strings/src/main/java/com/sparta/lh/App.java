package com.sparta.lh;

import java.util.Objects;

public class App {
    public static void main(String[] args) {
        String string1 = "Hello";
        String string2 = "Hello";
        String string3 = new String("Hello");
        String string4 = new String("Hello");


        System.out.println(System.identityHashCode(string1));
        System.out.println(System.identityHashCode(string2));
        System.out.println(System.identityHashCode(string3));
        System.out.println(System.identityHashCode(string4));
        System.out.println(string3.hashCode());
        System.out.println(string4.hashCode());
        System.out.println();
        System.out.println(string3 == string4);

    }
}
