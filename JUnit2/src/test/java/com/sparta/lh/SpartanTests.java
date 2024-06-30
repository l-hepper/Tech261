package com.sparta.lh;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class SpartanTests {

    @Test
    void SimpleTest() {
        Assertions.assertEquals(1, 1);
    }

    @RepeatedTest(value = 10, name = "this is a name")
    @DisplayName("Testing some stuff")
    void repeatedTest() {
        Assertions.assertEquals(1, 1);
    }

    @Test
    void checkNameOfSpartan() {
        Assertions.assertEquals(1, 1);
    }

}
