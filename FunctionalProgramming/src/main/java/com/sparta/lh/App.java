package com.sparta.lh;

import java.util.*;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {

        // write a method that checks if a string contains every letter in the alphabet.
        // HINT - characters have ASCII values
        List<String> names1 = new ArrayList<>();
        names1.add("Liam");
        System.out.println(hasExactlyTwoVowels(names));

//        boolean flag = word.chars().filter(c -> c < 'a' || c > 'z').
    }

    public static boolean hasEveryLetter(String word) {
        Set<Character> set = new HashSet<>();
        for (char c : word.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                set.add(c);
            }
        }
        return set.size() == 26;
    }

    // write a method that will take in a list of name and it will return another list
    // list should contain all the names that contain EXACTLY two vowels
    public static List<String> hasExactlyTwoVowels(List<String> names) {
        List<String> functionalList =
                names.stream()
                        .filter(name ->
                                name.chars()
                                        .filter(c -> "aeiou".indexOf(c) >= 0)
                                        .count() == 2
                        )
                        .toList();

        return functionalList;
    }
}
