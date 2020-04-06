package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Hoofdstuk4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char userInput;
        //Opdracht4.1
        System.out.println("Opdracht4.1\n");
        System.out.println("Van welk karakter wil je de ASCII waarde weten?");
        userInput = scanner.nextLine().charAt(0);
        int asciiValue = (int) userInput;
        System.out.println("De ASCII waarde van het karakter " + userInput + " is " + asciiValue + ".");

        //Opdracht4.2
        System.out.println("Opdracht4.2\n");
        System.out.println("Van welk karakter wil je weten of het een getal of letter is?");
        userInput = scanner.nextLine().charAt(0);
        if (Character.isLetter(userInput)) {
            System.out.println("De " + userInput + " is een letter.");
        } else if (Character.isDigit(userInput)) {
            System.out.println("De " + userInput + " is een getal. ");
        } else {
            System.out.println("De " + userInput + " is geen letter of getaal. ");
        }

        //Opdracht4.3
        System.out.println("Opdracht4.3\n");
        System.out.println("Van welke letter wil je weten of het een klinker is?");
        userInput = scanner.nextLine().toLowerCase().charAt(0);
        if (userInput == 'a' || userInput == 'e' || userInput == 'i' || userInput == 'o' || userInput == 'u') {
            System.out.println("De " + userInput + " is een klinker.");
        } else {
            System.out.println("De" + userInput + " is een medeklinker.");
        }


        //Opdracht4.4
        System.out.println("Opdracht4.4\n");
        System.out.println("Van welke letter wil je het nummer weten?");
        userInput = scanner.nextLine().toLowerCase().charAt(0);
        if (userInput == 'a' || userInput == 'b' || userInput == 'c') {
            System.out.println("De letter " + userInput + " op de nummer 2.");
        } else if (userInput == 'd' || userInput == 'e' || userInput == 'f') {
            System.out.println("De letter " + userInput + " op de nummer 3.");
        } else if (userInput == 'g' || userInput == 'h' || userInput == 'i') {
            System.out.println("De letter " + userInput + " op de nummer 4.");
        } else if (userInput == 'j' || userInput == 'k' || userInput == 'l') {
            System.out.println("De letter " + userInput + " op de nummer 5.");
        } else if (userInput == 'm' || userInput == 'n' || userInput == 'o') {
            System.out.println("De letter " + userInput + " op de nummer 6.");
        } else if (userInput == 'p' || userInput == 'q' || userInput == 'r' || userInput == 's') {
            System.out.println("De letter " + userInput + " op de nummer 7.");
        } else if (userInput == 't' || userInput == 'u' || userInput == 'v') {
            System.out.println("De letter " + userInput + " op de nummer 8.");
        } else if (userInput == 'w' || userInput == 'x' || userInput == 'y' || userInput == 'z') {
            System.out.println("De letter " + userInput + " op de nummer 9.");
        } else {
            System.out.println("Is geen cijfer.");
        }

        //Opdracht4.5
        System.out.println("Opdracht4.5\n");
        int randomNumber = (int) (Math.random() * 26 + 97);
        char ascilChar = (char) randomNumber;
        System.out.println("Uw willekeurige letter is de " + ascilChar + ".");

        //Opdracht4.6
        System.out.println(" Opdracht4.6\n");
        System.out.println("Typ een string");
        String userString = scanner.nextLine();
        int length = userString.length();
        System.out.println("De lengte van de string is " + length + ".");
        char firstChar = userString.charAt(0);
        System.out.println("Het eerste karakter is " + firstChar + " .");
        char lastchar = userString.charAt(length - 1);
        System.out.println("Het laatste karakter is " + lastchar + " .");

        //Opdracht4.7
        System.out.println("Opdracht4.7\n");
        System.out.println("land1 :");
        String land1 = scanner.nextLine();
        System.out.println("land2 :");
        String land2 = scanner.nextLine();
        System.out.println("land3 :");
        String land3 = scanner.nextLine();
        String[] land = {land1, land2, land3};
        Arrays.sort(land);
        System.out.println(land[0] + " - " + land[1] + " - " + land[2]);

    }
}

