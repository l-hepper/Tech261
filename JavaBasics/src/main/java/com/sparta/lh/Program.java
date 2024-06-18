package com.sparta.lh;

public class Program {
    public static void main(String[] args) {
        int timeOfDay = 21;
        System.out.println(getGreeting(timeOfDay));
    }

//    public static String getGreeting(int timeOfDay) {
//        String greeting;
//        if (timeOfDay >= 5 && timeOfDay <= 12) {
//            greeting = "Good Morning";
//        } else if (timeOfDay >= 12 && timeOfDay <= 18) {
//            greeting = "Good Afternoon";
//        } else {
//            greeting = "Good Evening";
//        }
//
//        return greeting;
//    }

    public static String getGreeting(int timeOfDay) {

        if (timeOfDay < 5 || timeOfDay >= 24) {
            return "Invalid Input";
        }

        String greeting;
        if (timeOfDay >= 18) {
            greeting = "Good Evening";
        } else if (timeOfDay >= 12) {
            greeting = "Good Afternoon";
        } else {
            greeting = "Good Morning";
        }

        return greeting;
    }
}
