package com.company;

import java.applet.Applet;
import java.util.Scanner;

public class Hoofdstuk2 extends Applet {


    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Opdracht 2.1
        System.out.println("Opdracht 2.1\n");
        System.out.print("Type het aantal mijlen: ");
        double mijlen = scanner.nextDouble();
        double kilometers = mijlen * 1.6;
        System.out.println(mijlen + " mijlen is " + kilometers + " kilometers" + "\n");

        // Opdracht 2.2
        System.out.println("Opdracht 2.2\n");
        System.out.print("Hoe out ben jij in jaren?");
        int jaren = scanner.nextInt();
        System.out.print("Hoe veel maanden komen erbij?");
        int maanden = scanner.nextInt();
        int min = jaren * 365 * 24 * 60 + maanden * 30 * 24 *60;
        System.out.println("Dan ben je nu ongeveer " + min + " minuten oud " + "\n");

        //Opdracht 2.3
        System.out.println("Opdracht 2.3\n");
        System.out.print("Typ het startbedrag:");
        double  startbedrag = scanner.nextDouble();
        System.out.print("Typ het rentepercentage:");
        double rentepercentage = scanner.nextDouble();
        double rentebedrag = rentepercentage / 100 * startbedrag;
        double totaalbedrag = startbedrag + rentebedrag;
        System.out.println("De rente is " + rentebedrag + " en het totaalbedrag is" + totaalbedrag + "\n");

        //Opdracht 2.4
        System.out.println("Opdracht 2.4\n");
        System.out.print("Typ een getal tussen 10 en 100:");
        int userinput = scanner.nextInt();
        int buurman = userinput - 2;
        int buurman2 = userinput - 1;
        int buurman3 = userinput;
        int buurman4 = userinput + 1;
        int buurman5= userinput + 2;
        System.out.println("De vijf getallen zijn " + buurman + "-" + buurman2 + "-" + buurman3 + "-" + buurman4 + "-" + buurman5 + "\n");

        //Opdracht 2.5
        System.out.println("Opdracht 2.5\n");
        System.out.print("Type een getal tussen de 0 en 1000: ");
        int userInput = scanner.nextInt();

        int lastDigit = userInput % 10;
        userInput = userInput / 10;

        int middleDigit= userInput % 10;
        userInput = userInput / 10;

        int firstDigit = userInput;

        int product = firstDigit * middleDigit * lastDigit;

        System.out.println("De vermenongvuldiging van de cijfers luidt: " + firstDigit + " x " + middleDigit + " x " + lastDigit + " = " + product);

 }

}
