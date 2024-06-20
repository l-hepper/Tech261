package com.sparta.lh;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    public void testHasThreeIdenticalNeighbours() {
        int[] numbers = {2, 3, 3, 3, 5, 7};
        assertTrue(App.hasThreeIdenticalNeighbours(numbers));
    }

    @Test
    public void testDoesNotHaveThreeIdenticalNeighbours() {
        int[] numbers = {3, 4, 5, 1, 2};
        assertFalse(App.hasThreeIdenticalNeighbours(numbers));
    }

    @Test
    public void testEmptyArray() {
        int[] numbers = {};
        assertFalse(App.hasThreeIdenticalNeighbours(numbers));
    }

    @Test
    public void testArrayWithThreeElements() {
        int[] numbers = {1, 1, 1};
        assertTrue(App.hasThreeIdenticalNeighbours(numbers));
    }

    @Test
    public void testArrayWithTwoElements() {
        int[] numbers = {5, 5};
        assertFalse(App.hasThreeIdenticalNeighbours(numbers));
    }

    @Test
    public void testArrayWithOneElement() {
        int[] numbers = {5};
        assertFalse(App.hasThreeIdenticalNeighbours(numbers));
    }

    @Test
    public void testArrayWithNegativeNumbers() {
        int[] numbers = {-1, -1, -1, 0, 1, 2};
        assertTrue(App.hasThreeIdenticalNeighbours(numbers));
    }

    @Test
    public void testArrayWithNonConsecutiveElements() {
        int[] numbers = {1, 0, 0, 1, 0};
        assertFalse(App.hasThreeIdenticalNeighbours(numbers));
    }

    // implement null array handling
    @Test
    public void testNullArray() {
        int[] numbers = null;
        assertFalse(App.hasThreeIdenticalNeighbours(numbers));
    }
}
