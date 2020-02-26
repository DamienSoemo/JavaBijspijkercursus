package com.company;

import java.applet.Applet;
import java.util.Scanner;

public class Hoofdstuk2 extends Applet {


    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Opdracht 2.1
        System.out.print("Opdracht 2.1" + "\n");
        System.out.print("Type het aantal mijlen: ");
        double mijlen = scanner.nextDouble();
        double kilometers = mijlen * 1.6;
        System.out.println(mijlen + " mijlen is " + kilometers + " kilometers" + "\n");

        // Opdracht 2.2
        System.out.print("Opdracht 2.2" + "\n");
        System.out.print("Hoe out ben jij in jaren?");
        int jaren = scanner.nextInt();
        System.out.print("Hoe veel maanden komen erbij?");
        int maanden = scanner.nextInt();
        int min = jaren * 365 * 24 * 60 + maanden * 30 * 24 *60;
        System.out.println("Dan ben je nu ongeveer " + min + " minuten oud " + "\n");

        //Opdracht 2.3
        System.out.print("Opdracht 2.3" + "\n");
        System.out.print("Typ het startbedrag:");
        int start = scanner.nextInt();
        System.out.print("Typ het rentepercentage:");
        int rente = scanner.nextInt();

        //Opdracht 2.4
        System.out.print("Opdracht 2.4" + "\n");
        System.out.println();
    }

}
