package com.sparta.lh;

//Create an abstract class called Trainee with the following fields:
//
//name
//        age
//email
//        phone
//Create a subclass called JavaTrainee that extends Trainee and has the following fields:
//
//experience
//        certifications
//projects
//        github
//Create a subclass called DevOpsTrainee that extends Trainee and has the following fields:
//
//experience
//        certifications
//projects
//Create an interface called Trainable with the following methods:
//
//train()
//study()
//Make the JavaTrainee and DevOpsTrainee classes implement the Trainable interface.
//


public class App {
    public static void main(String[] args) {

        Trainee liam = new JavaTrainee(
                "Liam",
                32,
                "liam@mail.com",
                "12345",
                "Lots of experience",
                "No certs",
                "Samurise",
                "liam@github");

        Trainee bob = new DevOpsTrainee(
                "Bob",
                25,
                "bob@mail.com",
                "54321",
                "no experience",
                "CSSIP",
                "251 To-Do Apps");

        System.out.println(liam);
        System.out.println(bob);
    }
}
