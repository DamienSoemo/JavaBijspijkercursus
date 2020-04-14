package com.company;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Hoofdstuk7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int counter;

//        //Opdracht7.1
//        System.out.println("Opdracht7.1\n");
//        System.out.println("Hier komen 100 worpen met een dobbelsteen:\n");
//        int[] dobbelsteen = new int[100];
//        for (int i = 0; i <100 ; i++) {
//            int random = (int) (Math.random() * 6 + 1);
//            dobbelsteen[i] = random;
//        }
//        counter = 1;
//        for (int worp : dobbelsteen) {
//            System.out.print(worp + " ");
//            if (counter % 10 == 0) {
//                System.out.println();
//            }
//            counter++;
//        }

//        //Opdracht7.2
//        System.out.println("Opdracht7.2\n");
//        System.out.println("Geef me 9 integers.");
//        int[] getallen = new int[9];
//        for (int i = 0; i <9 ; i++) {
//        getallen[i] = scanner.nextInt();
//        }
//        System.out.println("Daar komen ze, in omgekeerde volgorde. ");
//        for (int i = 8; i >=0 ; i--) {
//            System.out.println(getallen[i] + " ");
//
//        }

        //Opdracht7.3
        System.out.println("Opdracht7.3\n");
        System.out.println("Geef me nu 10 doubles, dan bereken ik het gemiddelde en tel ik hoeveel cijfers hoger zijn.");
        double[] userInput = new double[10];
        for (int i = 0; i < 10; i++) {
            userInput[i] = scanner.nextDouble();
        }

        double optelsom = 0;
        for (double waarde : userInput) {
            optelsom = optelsom += waarde;

        }

        double gemiddelde = optelsom / 10;
        System.out.println("Het gemiddelde is " + gemiddelde);
        counter = 0;
        for (double waarde : userInput) {
            if (waarde > gemiddelde) {
                counter++;
            }
        }
        System.out.println("Het aantal doubles boven het gemiddelde is " + counter);
    }

}
