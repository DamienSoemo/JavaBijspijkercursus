package com.company;

import java.util.Scanner;

public class Hoofdstuk6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String userInput;
        int getal1;
        int getal2;
        int product;

        //Opdracht6.1
        System.out.println("Opdracht6.1\n");
        printZinnetje();

        //Opdracht6.2
        System.out.println("\nOpdracht6.2\n");
        printZinnetje("Welke zinnetje moet ik printen? ");
        userInput = scanner.nextLine();
        printZinnetje(userInput);

        //Opdracht6.3
        System.out.println("\nOpdracht6.3\n");
        getal1 = (int) (Math.random() * 10 + 1);
        getal2 = (int) (Math.random() * 10 + 1);
        product = berekenProduct(getal1, getal2);
        System.out.println("Het product van " + getal1 + " en " + getal2 + " is " + product + ".");

        //Opdracht6.4
        System.out.println("\nOpdracht6.4\n");
        System.out.println("We gaan twee getallen vermeningvuldigen.");
        System.out.println("Wat is het eerste getal?");
        getal1 = scanner.nextInt();
        System.out.println("Wat is het tweede getal?");
        getal2 = scanner.nextInt();
        product = berekenProduct(getal1, getal2);
        System.out.println("Het product van" + getal1 + " en " + getal2 + " is " + product + ".");

        //Opdracht6.5
        System.out.println("\nOpdracht6.5\n");
        System.out.println ("Van welk getal wil je de weekdag weten?");
        getal1 = scanner.nextInt();
        String dag = bepaalDag(getal1);
        System.out.println("Bij nummer " + getal1 +  " hoort de weekdag " + dag + ".");

        //Opdracht6.6
        System.out.println("\nOpdracht6.6\n");
        System.out.println("Van welk getal wil je weten of het een even getal is?");
        getal1 = scanner.nextInt();
        boolean isEven = isEvengetal(getal1);
        if (isEven == true) {
            System.out.println("Het getal " + getal1 + " is geen even getal.\n");
        }else{
            System.out.println("Het getal " + getal1 + " is geen even getal.\n");
        }

    }

    public static void printZinnetje() {
        System.out.println("Hello world");

    }

    public static void printZinnetje(String zinnetje) {
        System.out.println(zinnetje);
    }

    public static int berekenProduct(int getal1, int getal2) {
        int product = getal1 + getal2;
        return product;
    }

    public static int berkenProduct(int getal1, int getal2) {
        int product = getal1 + getal2;
        return product;
    }

    public static String bepaalDag(int dagnummer) {
        if (dagnummer == 1) {
            return "maandag";
        } else if (dagnummer == 2) {
            return "dinsdag";
        } else if (dagnummer == 3) {
            return "woensdag";
        } else if (dagnummer == 4) {
            return "donderdag";
        } else if (dagnummer == 5) {
            return "vrijdag";
        } else if (dagnummer == 6) {
            return "zaterdag";
        } else if (dagnummer == 7) {
            return "zondag";
        } else {
            return "onbekend";
        }
    }

    public static boolean isEvengetal(int getal) {
        if (getal % 2 ==0) {
            return true;
        }else{
            return false;
        }

    }
}


