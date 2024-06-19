package com.sparta.lh;

public class App {

    public static boolean hasThreeIdenticalNeighbours(int[] numbers) {
        if (numbers.length < 3) {
            return false;
        }

        for (int i = 2; i < numbers.length; i++) {
            if (numbers[i] == numbers[i-1] && numbers[i] == numbers[i-2]) {
                return true;
            }
        }

        return false;
    }
}
