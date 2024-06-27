package com.sparta.lh;

public class App {
    public static void main(String[] args) {
        IntegerRectangle integerRectangle = new IntegerRectangle(2, 4);
        System.out.printf("Integer Rectangle area: %d\n",
                integerRectangle.getWidth() * integerRectangle.getHeight());

        DoubleRectangle doubleRectangle = new DoubleRectangle(3.0, 6.0);
        System.out.printf("Double Rectangle area: %f\n", doubleRectangle.getWidth() * doubleRectangle.getLength());


    }


}
