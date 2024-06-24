package com.sparta.lh;

import java.util.Objects;

public class App {
    public static void main(String[] args) {
        int message = Integer.parseInt(null);
        System.out.println(oddOrEven(message));
    }

    public static boolean oddOrEven(int n) {
        return n % 2 == 0;
    }
}
