package com.sparta.lh;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class LongestPalindromeTest {

    @Test
    public void givenSentenceWithOnePalindromeShouldReturnListWithOnePalindrome() {
        String sentence = "i have a racecar";
        List<String> expected = new ArrayList<>(List.of("racecar"));
        List<String> actual = LongestPalindrome.getLongestPalindromes(sentence);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void givenAPalindromeWithSpecialCharsShouldReturnListWithOnePalindrome() {
        String sentence = "i have a ra!ceca!r";
        List<String> expected = new ArrayList<>(List.of("racecar"));
        List<String> actual = LongestPalindrome.getLongestPalindromes(sentence);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void givenThreeLetterPalindromeShouldReturnListWithOnePalindrome() {
        String sentence = "lol";
        List<String> expected = new ArrayList<>(List.of("lol"));
        List<String> actual = LongestPalindrome.getLongestPalindromes(sentence);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void givenTwoLetterPalindromeShouldReturnListEmptyList() {
        String sentence = "ll";
        List<String> expected = new ArrayList<>();
        List<String> actual = LongestPalindrome.getLongestPalindromes(sentence);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void givenMultiplePalindromesShouldReturnLongestPalindrome() {
        String sentence = "racecar madam lol aa c";
        List<String> expected = new ArrayList<>(List.of("racecar"));
        List<String> actual = LongestPalindrome.getLongestPalindromes(sentence);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void givenEmptyStringShouldReturnEmptyList() {
        String sentence = "";
        List<String> expected = new ArrayList<>();
        List<String> actual = LongestPalindrome.getLongestPalindromes(sentence);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void givenNoPalindromeInSentenceShouldReturnEmptyList() {
        String sentence = "hello world";
        List<String> expected = new ArrayList<>();
        List<String> actual = LongestPalindrome.getLongestPalindromes(sentence);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void givenMixedCasePalindromeShouldReturnListWithOnePalindrome() {
        String sentence = "RACECAR madam is really cool";
        List<String> expected = new ArrayList<>(List.of("racecar"));
        List<String> actual = LongestPalindrome.getLongestPalindromes(sentence);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void givenMultipleInstancesOfSamePalindromeShouldReturnOne() {
        String sentence = "racecar racecar";
        List<String> expected = new ArrayList<>(List.of("racecar"));
        List<String> actual = LongestPalindrome.getLongestPalindromes(sentence);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void givenMultipleInstancesOfSameLengthPalindromeShouldReturnAllLongestPalindromes() {
        String sentence = "llllll aaaaaa bbbbbb cccccc";
        List<String> expected = new ArrayList<>(List.of("llllll", "aaaaaa", "bbbbbb", "cccccc"));
        List<String> actual = LongestPalindrome.getLongestPalindromes(sentence);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void givenMultipleSameLengthPalindromesWithMixedSpecialCharsAndDigits() {
        String sentence = "!ll@llll aa123aaaa bbbbbb## c!!ccccc";
        List<String> expected = new ArrayList<>(List.of("llllll", "aaaaaa", "bbbbbb", "cccccc"));
        List<String> actual = LongestPalindrome.getLongestPalindromes(sentence);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void givenOnlySpecialCharactersShouldReturnEmptyList() {
        String sentence = "!£$%^&*({}:@?";
        List<String> expected = new ArrayList<>();
        List<String> actual = LongestPalindrome.getLongestPalindromes(sentence);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void givenTheLongestPalindromeMultipleTimes() {
        String sentence = "aaaaaaaaaa llllllll aaaaaaaaaa";
        List<String> expected = new ArrayList<>(List.of("aaaaaaaaaa"));
        List<String> actual = LongestPalindrome.getLongestPalindromes(sentence);
        Assertions.assertEquals(expected, actual);
    }
}
