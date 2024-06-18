package com.sparta.lh;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FizzBuzzTests {
    // print numbers in order

    // if the number is divis by 3 then print "Fizz"

    // if the number is divis by 5 then print "Buzz"

    // if the number is divis by both print "FizzBuzz"

    @Test
    @DisplayName("Given an input of 1, then FizzBuzz should return 1")
    void givenAnInputOf1FizzBuzzReturns1() {
        // arrange
        int input = 1;
        String expected = "1";
        // act
        String actual = FizzBuzz.getFizzBuzzFrom(input);
        // assert
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({"-2, -2",
            "-1, -1",
            "2, 2",
            "4, 4",
            "7, 7"})
    void givenInputsNotDivisibleByThreeOrFiveFizzBuzzReturnsThatNumber(int input, String expected) {
        String actual = FizzBuzz.getFizzBuzzFrom(input);
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @ValueSource(ints = {-9, -6, -3, 3, 6, 9})
    @DisplayName("Given an input of 3, 6, 9, then FizzBuzz should return 'Fizz'")
    void givenAnInputOf3FizzBuzzReturns3(int input) {
        // arrange
        String expected = "Fizz";
        // act
        String actual = FizzBuzz.getFizzBuzzFrom(input);
        // assert
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Given an input of 0, then FizzBuzz should return FizzBuzz")
    void givenAnInputOf0FizzBuzzReturnsFizzBuzz() {
        String expected = "FizzBuzz";
        String actual = FizzBuzz.getFizzBuzzFrom(0);
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource({"getPositiveFizzBuzzStream", "getNegativeFizzBuzzStream"})
    @DisplayName("Given an input stream of integers of multiple of BOTH 3 and 5, fizzBuzz should return 'Fizz Buzz'")
    void givenAnInputOfFizzBuzzStreamReturnsFizzBuzz(int input) {
        String expected = "FizzBuzz";
        String actual = FizzBuzz.getFizzBuzzFrom(input);
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource({"getBuzzStream", "getNegativeBuzzStream"})
    @DisplayName("Given an input stream of multiple of 5, fizzBuzz should return 'Buzz'")
    void givenAnInputOfBuzzStreamFizzBuzzReturnsBuzz(int input) {
        String expected = "Buzz";
        String actual = FizzBuzz.getFizzBuzzFrom(input);
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Integer> getPositiveFizzBuzzStream() {
        return Stream.of(15, 30, 45, 60);
    }

    static Stream<Integer> getNegativeFizzBuzzStream() {
        return Stream.of(-15, -30, -45, -60);
    }

    static Stream<Integer> getBuzzStream() {
        return Stream.of(5, 10, 20, 25);
    }

    static Stream<Integer> getNegativeBuzzStream() {
        return Stream.of(-5, -10, -20, -25);
    }
}
