package com.company;

import java.util.Scanner;

public class Hoofdstuk5 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean proceed;

        //Opdracht5.1
        System.out.println("Opdracht5.1\n");
        proceed = true;
        while (proceed == true) {
            System.out.println("Wat is je toetscijfer?");
            double grade = scanner.nextDouble();
            if (grade == -1) {
                System.out.println("Tot ziens.");
                proceed = false;
                continue;
            }else if ( grade >= 5.5) {
                System.out.println("Je hebt een voldoende.");
            }else{
                System.out.println("Je hebt een onvoldoende.");

            }
        }

//        Opdracht5.2
        System.out.println(" Opdracht5.2");
        int score = 0;
        for (int i = 0; i <10; i++) {
            int getal1 = (int) (Math.random() * 10 + 1);
            int getal2 = (int) (Math.random() * 10 + 1);
            int optelsom = getal1 + getal2;
            System.out.println("Hoeveel is " + getal1 + "+" + getal2 + "?");
            int userInput = scanner.nextInt();
            if (userInput == optelsom) {
                System.out.println("Dat klopt!");
                score++;
            } else {
                System.out.println("Helaas het antwoord is" + optelsom + ".");
            }
        }
            System.out.println("De toets is klaar. Je score is" + score + ".");

        //Opdracht5.3
        System.out.println("Opdracht5.3\n");
        for (int i = 1; i <10 ; i++) {
            int product = i * 7;
            System.out.println(i + " x 7 = " + product);
        }

        //Opdracht5.4
        System.out.println("Opdracht 5.4\n");
        int lowestNumber = 0;
        for (int i = 0; i <5 ; i++) {
            System.out.println("Typ een getal:");
            int number = scanner.nextInt();
            if (i == 0) {
                lowestNumber = number;
            }else{
                if(number < lowestNumber) {
                    lowestNumber = number;
                }
            }

        }
        System.out.println("Het laagste getal wat je hebt getypt was " + lowestNumber + ". ");

        //Opdracht5.5
        System.out.println("Opdracht 5.5\n");
        double highstGrade = 0;
        String student = "unkown";
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hoe heet de " + i + "e student? ");
            String name = scanner.nextLine();
            System.out.println("Wat was zijn of haar cjfer? ");
            double grade = scanner.nextDouble();
            scanner.nextLine();
            if (i == 0) {
                highstGrade = grade;
                student = name;
            } else {
                if (grade > highstGrade) {
                    highstGrade = grade;
                    student = name;
                }
            }

        }
            System.out.println("het hoogste cijfer is van " + student + ".");
            System.out.println("Die gene had een " + highstGrade + ".");

  //Opdracht5.6
            System.out.println("Opdracht 5,6\n");
            for (int i = 0; i <100; i++) {
                if (i % 5 == 0) {
                    System.out.println(i + " is deelbaar door 5.");
                }

            }


        //Opdracht5.7
        System.out.println("Opdracht5.7\n");
        proceed = true;
        int counter = 0;
        while (proceed) {
            int square = counter * counter;
            if (square < 1000) {
                System.out.println("Het getal is " + counter);
                System.out.println("Het kwadraat daarvan is" + square);
                counter++;
            } else {
                proceed = false;
            }
        }
    }

}

