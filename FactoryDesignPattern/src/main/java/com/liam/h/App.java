package com.liam.h;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What do you coffee do you want?");
        String myCoffee = scan.nextLine();
        Coffee coffee = CoffeeFactory.getCoffee(myCoffee);
        coffee.drink();


    }
}
