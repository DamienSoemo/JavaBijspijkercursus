package com.company;

import java.applet.Applet;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Hoofdstuk3 extends Applet {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Opdracht 3.1
        System.out.println("Opdracht3.1\n");
        int random1 = (int) (Math.random() * 10 + 1);
        int random2 = (int) (Math.random() * 10 + 1);
        System.out.println("Hoeveel is " + random1 + " + " + random2 + " ? ");
        int userInput =scanner.nextInt();
        int uitkomst = random1 + random2;
        if (userInput == uitkomst) {
            System.out.println("Klopt!");
        }else{
            System.out.println("Helaas, het juiste antwoorde is " + uitkomst + ".\n");
        }

        //Opdracht 3.2
        System.out.println("Opdracht 3.2\n");
        int random4 = (int) (Math.random() * 10 + 1);
        int random5 = (int) (Math.random() * 10 + 1);
        int random6 = (int) (Math.random() * 10 + 1);
        System.out.println("Hoeveel is " + random4 + " x " + random5 + " x " + random6 + "?");
        userInput = scanner.nextInt();
        uitkomst = random4 * random5 * random6;
        if (userInput == uitkomst){
            System.out.println("Helemaal top!");
        }else{
            System.out.println("Helaas, het klopt niet");
        }

        //Opdracht 3.3
        System.out.println("Opdracht3.3\n");
        random1 = (int) (Math.random() * 12 + 1);
        String maand = "onbekend";
        switch (random1) {
            case 1: maand = "januari"; break;
            case 2: maand = "februari";break;
            case 3: maand = "maart"; break;
            case 4: maand = "april"; break;
            case 5:
            maand = "mei";
            break;
            case 6:
            maand = "juni";
            break;
            case 7:
            maand = "juli";
            break;
            case 8:
            maand = "augustus";
            break;
            case 9:
            maand = "september";
            break;
            case 10:
            maand = "oktober";
            break;
            case 11:
            maand = "november";
            break;
            case 12:
            maand = "december";
            break;

                      }
                      System.out.println("Het random getal is " + random1 + " dat is de maand " + maand + ".");


//        //Opdracht3.4
        System.out.println("Opdracht3.4\n");
        System.out.print ("Welke weekdag is het nu? ( 1 = ma / 2 = di / 3 = wo / 4 = do / 5 = vr / 6 = za / 7 = zo )");
        int weekdag = scanner.nextInt();
        System.out.println("En van hoeveel dagen in de toekomst wil je de weekdag berekenen?\n");
        int dagenvooruit = scanner.nextInt();
        int resultaat = weekdag + dagenvooruit;
        if (resultaat > 7) {
            resultaat = resultaat % 7;

        }
        String[] weekdagen ={"onbekend","maandag","dinsdag","woensdag","donderdag","vrijdag","zaterdag","zondag"};
        System.out.println("Vandaag is het "+ weekdagen[weekdag] +" en over " + dagenvooruit + " dagen is het " + weekdagen[resultaat] +".");



            //Opdracht3.5
        System.out.println("Opdracht3.5\n");
        System.out.println("Wat is u gewicht?");
        double gewicht = scanner.nextDouble();
        System.out.println("Wat is uw lengte (m)?12");
        double lengte = scanner.nextDouble();
        double teller = gewicht;
        double noemer = lengte * lengte;
        double bmi = lengte / noemer;
          int tussenstap = (int) (bmi * 100);
          bmi = tussenstap / 100.0;
        System.out.println("Uw Bmi is " + bmi + ".");
        String conclusie = "onbekend";
        if (bmi < 18.5) {
            conclusie = "ondergewicht heeft";
        } else if (bmi < 25) {
            conclusie = "U heeft een normaal gewicht";
        } else if (bmi < 30) {
            conclusie = "U heeft overgewicht";
        } else {
            conclusie = "U heeft zwaar overgewicht";
        }
        System.out.println("Als u minstens 20 jaar bent beteknt dit dat u " + conclusie + ".");

        // Opdracht 3.6
        System.out.println("Opdracht 3.6\n" );
        System.out.println("Getal 1:" );
        int getal1 = scanner.nextInt();
        System.out.println("Getal 2:" );
        int getal2 = scanner.nextInt();
        System.out.println("Getal 3:" );
        int getal3 = scanner.nextInt();
        int[] getallen = {getal1, getal2, getal3};
        Arrays.sort(getallen);
        System.out.println("Van klein naar groot:" + getallen[0] + "-" + getallen[1] + "-" + getallen[2]);

    }
}

