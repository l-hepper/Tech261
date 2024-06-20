package com.sparta.lh;

public class PalindromeChecker {

    // the leetcode way
//    public static boolean isPalindrome(String string) {
//        if (string == null || string.length() < 3) {
//            return false;
//        }
//
//        string = string.toLowerCase();
//
//        for (int i = 0, j = string.length() - 1; i < string.length() / 2; i++, j--) {
//            if (string.charAt(i) != string.charAt(j)) {
//                return false;
//            }
//        }
//
//        return true;
//    }

    // the more efficient way using StringBuilder
    public static boolean isPalindrome(String string) {
        if (string == null || string.length() < 3) {
            return false;
        }

        string = string.toLowerCase();

        return new StringBuilder(string).reverse().toString().equals(string);
    }
}
