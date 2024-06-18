package com.sparta.lh;

//        Given an array of integers, convert them to a single int made up of the digits
//
//        for example the array:
//
//        int[] numbers = {1, 0, 2, 4}
//
//        should return the int 1024.
//
//        Use TDD and ask if you need any requirements clarified

public class ArrayOfIntegersToInt {

    public static int method(int[] numbers) {
        if (numbers.length == 0) {
            return 0;
        }

        StringBuilder newString = new StringBuilder();
        for (int number : numbers) {
            newString.append(number);
        }

        return Integer.parseInt(String.valueOf(newString));
    }
}
