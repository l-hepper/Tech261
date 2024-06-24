package com.sparta.lh;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LongestPalindromeTest {

    @Test
    public void givenSentenceWithOnePalindromeShouldReturnSetWithOnePalindrome() {
        String sentence = "i have a racecar";
        Set<String> expected = new HashSet<>(Set.of("racecar"));
        Set<String> actual = new HashSet<>(LongestPalindrome.getLongestPalindromes(sentence));
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void givenAPalindromeWithSpecialCharsShouldReturnSetWithOnePalindrome() {
        String sentence = "i have a ra!ceca!r";
        Set<String> expected = new HashSet<>(Set.of("racecar"));
        Set<String> actual = new HashSet<>(LongestPalindrome.getLongestPalindromes(sentence));
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void givenThreeLetterPalindromeShouldReturnSetWithOnePalindrome() {
        String sentence = "lol";
        Set<String> expected = new HashSet<>(Set.of("lol"));
        Set<String> actual = new HashSet<>(LongestPalindrome.getLongestPalindromes(sentence));
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void givenTwoLetterPalindromeShouldReturnEmptySet() {
        String sentence = "ll";
        Set<String> expected = new HashSet<>();
        Set<String> actual = new HashSet<>(LongestPalindrome.getLongestPalindromes(sentence));
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void givenMultiplePalindromesShouldReturnLongestPalindrome() {
        String sentence = "racecar madam lol aa c";
        Set<String> expected = new HashSet<>(Set.of("racecar"));
        Set<String> actual = new HashSet<>(LongestPalindrome.getLongestPalindromes(sentence));
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void givenEmptyStringShouldReturnEmptySet() {
        String sentence = "";
        Set<String> expected = new HashSet<>();
        Set<String> actual = new HashSet<>(LongestPalindrome.getLongestPalindromes(sentence));
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void givenNoPalindromeInSentenceShouldReturnEmptySet() {
        String sentence = "hello world";
        Set<String> expected = new HashSet<>();
        Set<String> actual = new HashSet<>(LongestPalindrome.getLongestPalindromes(sentence));
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void givenMixedCasePalindromeShouldReturnSetWithOnePalindrome() {
        String sentence = "RACECAR madam is really cool";
        Set<String> expected = new HashSet<>(Set.of("racecar"));
        Set<String> actual = new HashSet<>(LongestPalindrome.getLongestPalindromes(sentence));
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void givenMultipleInstancesOfSamePalindromeShouldReturnOne() {
        String sentence = "racecar racecar";
        Set<String> expected = new HashSet<>(Set.of("racecar"));
        Set<String> actual = new HashSet<>(LongestPalindrome.getLongestPalindromes(sentence));
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void givenMultipleInstancesOfSameLengthPalindromeShouldReturnAllLongestPalindromes() {
        String sentence = "llllll aaaaaa bbbbbb cccccc";
        Set<String> expected = new HashSet<>(Set.of("llllll", "aaaaaa", "bbbbbb", "cccccc"));
        Set<String> actual = new HashSet<>(LongestPalindrome.getLongestPalindromes(sentence));
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void givenMultipleSameLengthPalindromesWithMixedSpecialCharsAndDigits() {
        String sentence = "!ll@llll aa123aaaa bbbbbb## c!!ccccc";
        Set<String> expected = new HashSet<>(Set.of("llllll", "aaaaaa", "bbbbbb", "cccccc"));
        Set<String> actual = new HashSet<>(LongestPalindrome.getLongestPalindromes(sentence));
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void givenOnlySpecialCharactersShouldReturnEmptySet() {
        String sentence = "!£$%^&*({}:@?";
        Set<String> expected = new HashSet<>();
        Set<String> actual = new HashSet<>(LongestPalindrome.getLongestPalindromes(sentence));
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void givenTheLongestPalindromeMultipleTimesSeparated() {
        String sentence = "aaaaaaaaaa llllllll aaaaaaaaaa";
        Set<String> expected = new HashSet<>(Set.of("aaaaaaaaaa"));
        Set<String> actual = new HashSet<>(LongestPalindrome.getLongestPalindromes(sentence));
        Assertions.assertEquals(expected, actual);
    }
}
