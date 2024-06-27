package com.sparta.lh;

import com.sparta.lh.decorator.Italian;
import com.sparta.lh.decorator.sides.Chips;
import com.sparta.lh.decorator.sides.Salad;
import com.sparta.lh.singleton.SingletonExample;

public class App {
    public static void main(String[] args) {
        Italian italian = new Italian();
        System.out.println(italian.getDescription() + " Cost:" + italian.getCost());

        Salad salad = new Salad(italian);

        System.out.println(salad.getDescription() + " Cost:" + salad.getCost());

        Chips chips = new Chips(italian);
        System.out.println(chips.getDescription() + "Cost: "+ chips.getCost());

    }
}
