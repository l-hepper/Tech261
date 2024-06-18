package com.sparta.lh;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ArrayOfIntegersTests {

    @Test
    @DisplayName("Given an array of 1 integer, ArrayOfIntegersToInt.method() should return 1")
    void givenAnArrayOf1ShouldReturn1() {
        // arrange
        int[] array = {1};
        int expected = 1;
        // act
        int actual = ArrayOfIntegersToInt.method(array);
        // assert
        Assertions.assertEquals(expected, actual);
    }
}
