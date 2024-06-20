package com.sparta.lh;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromeCheckerTest {

    @Test
    public void givenPalindromeIsPalindromeShouldReturnTrue() {
        String word = "racecar";
        Assertions.assertTrue(PalindromeChecker.isPalindrome(word));
    }

    @Test
    public void givenEvenNumberLengthPalindromeShouldReturnTrue() {
        String word = "jkookj";
        Assertions.assertTrue(PalindromeChecker.isPalindrome(word));
    }

    @Test
    public void givenOddNumberLengthPalindromeShouldReturnTrue() {
        String word = "jkoxokj";
        Assertions.assertTrue(PalindromeChecker.isPalindrome(word));
    }

    @Test
    public void givenNonPalindromeIsPalindromeShouldReturnFalse() {
        String word = "mountain";
        Assertions.assertFalse(PalindromeChecker.isPalindrome(word));
    }

    @Test
    public void givenNullIsPalindromeShouldReturnFalse() {
        String word = null;
        Assertions.assertFalse(PalindromeChecker.isPalindrome(word));
    }

    @Test
    public void givenEmptyStringIsPalindromeShouldReturnFalse() {
        String word = "";
        Assertions.assertFalse(PalindromeChecker.isPalindrome(word));
    }

    @Test
    public void givenTwoLettersIsPalindromeShouldReturnFalse() {
        String word = "lo";
        Assertions.assertFalse(PalindromeChecker.isPalindrome(word));
    }

    @Test
    public void givenTwoLetterPalindromeIsPalindromeShouldReturnFalse() {
        String word = "ll";
        Assertions.assertFalse(PalindromeChecker.isPalindrome(word));
    }
}
