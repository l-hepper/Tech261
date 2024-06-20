package com.sparta.lh;

import java.util.*;

public class LongestPalindrome {
    public static List<String> getLongestPalindromes(String sentence) {

        List<String> longestPalindromes = new ArrayList<>();

        String longestPalindrome = "";
        for (String word : getPreppedWordArray(sentence)) {

            if (PalindromeChecker.isPalindrome(word) && !word.equals(longestPalindrome)) {

                if (word.length() > longestPalindrome.length()) {
                    longestPalindromes.clear();
                    longestPalindrome = word;
                    longestPalindromes.add(word);
                } else if (word.length() == longestPalindrome.length()) {
                    longestPalindromes.add(word);
                }

            }
        }

        return longestPalindromes;
    }

    private static String[] getPreppedWordArray(String string) {
        StringBuilder preppedString = new StringBuilder();

        for (char c : string.toCharArray()) {
            if (Character.isLetter(c) || c == ' ') {
                preppedString.append(Character.toLowerCase(c));
            }
        }
        return preppedString.toString().split(" ");
    }
}
