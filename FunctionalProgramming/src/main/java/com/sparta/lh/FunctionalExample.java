package com.sparta.lh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FunctionalExample {
    public static void main(String[] args) {
        // Stream
        List<String> names = new ArrayList<>(Arrays.asList("Leonardo", "Michaelangelo", "Donatello", "Raphael"));

        names.stream()
                .map(String::toUpperCase)
                .filter(name -> name.contains("O"))
                .forEach(System.out::println);
    }
}
