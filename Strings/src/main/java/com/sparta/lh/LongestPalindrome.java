package com.sparta.lh;

import java.util.*;

public class LongestPalindrome {
    public static Set<String> getLongestPalindromes(String sentence) {

        Set<String> longestPalindromes = new HashSet<>();

        int longestPalindromeLength = 0;
        for (String word : prepSentence(sentence).split(" ")) {

            if (PalindromeChecker.isPalindrome(word)) {
                if (word.length() > longestPalindromeLength) {
                    longestPalindromes.clear();
                    longestPalindromeLength = word.length();
                    longestPalindromes.add(word);
                } else if (word.length() == longestPalindromeLength) {
                    longestPalindromes.add(word);
                }
            }
        }

        return longestPalindromes;
    }

    private static String prepSentence(String string) {
        StringBuilder preppedString = new StringBuilder();

        for (char c : string.toCharArray()) {
            if (Character.isLetter(c) || c == ' ') {
                preppedString.append(Character.toLowerCase(c));
            }
        }
        return preppedString.toString();
    }
}
