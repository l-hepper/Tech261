package com.sparta.lh;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ArrayOfIntegersToIntTest {

    @Test
    @DisplayName("Given an array of {1} integer, ArrayOfIntegersToInt.method() should return 1")
    void givenAnArrayOf1ShouldReturn1() {
        int[] array = {1};
        int expected = 1;
        int actual = ArrayOfIntegersToInt.method(array);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Given an array of {2, 4}, ArrayOfIntegersToInt.method() should return 24")
    void givenAnArrayOf2And4ShouldReturn24() {
        int[] array = {2, 4};
        int expected = 24;
        int actual = ArrayOfIntegersToInt.method(array);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Given an array of {0, 9, 0}, ArrayOfIntegersToInt.method() should return 90")
    void givenAnArrayWithLeading0() {
        int[] array = {0, 9, 0};
        int expected = 90;
        int actual = ArrayOfIntegersToInt.method(array);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Given an array of {0}, ArrayOfIntegersToInt.method() should return 0")
    void givenAnArrayWithJust0() {
        int[] array = {0};
        int expected = 0;
        int actual = ArrayOfIntegersToInt.method(array);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Given an array of {0, 0, 0, 0, 1}, ArrayOfIntegersToInt.method() should return 1")
    void givenAnArrayWithMultipleLeadingZeroes() {
        int[] array = {0, 0, 0, 0, 1};
        int expected = 1;
        int actual = ArrayOfIntegersToInt.method(array);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Given an array of {1, 23, 4, 5}, ArrayOfIntegersToInt.method() should return 12345")
    void givenAnArrayIncludingTwoDigitInteger() {
        int[] array = {1, 23, 4, 5};
        int expected = 12345;
        int actual = ArrayOfIntegersToInt.method(array);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Given an array of {999, 999, 999}, ArrayOfIntegersToInt.method() should return 999999999")
    void givenAnArrayOfThreeDigitIntegers() {
        int[] array = {999, 999, 999};
        int expected = 999999999;
        int actual = ArrayOfIntegersToInt.method(array);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Given an array of {}, ArrayOfIntegersToInt.method() should return 0")
    void givenAnEmptyArrayShouldReturn0() {
        int[] array = {};
        int expected = 0;
        int actual = ArrayOfIntegersToInt.method(array);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Given an array of {1, -1, -1}, ArrayOfIntegersToInt.method() should return 111")
    void givenAnArrayOfNegativeIntegersShouldReturnPositives() {
        int[] array = {1, -1, -1};
        int expected = 111;
        int actual = ArrayOfIntegersToInt.method(array);
        Assertions.assertEquals(expected, actual);
    }
}
