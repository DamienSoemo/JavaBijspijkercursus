package com.company;

import java.applet.Applet;

public class Hoofdstuk1 extends Applet {


    public static void main(String[] args) {

        //Opdracht 1.1
        System.out.print("Opdracht 1.1\n");
        System.out.println("Java is Object Georiënteerd");
        System.out.println("Java is strongly typed");
        System.out.println("Java is geen JavaScript\n");


        //Opdracht 1.2
        System.out.print("Opdracht 1.2\n");
        System.out.println("Java is geweldig!");
        System.out.println("Java is geweldig!");
        System.out.println("Java is geweldig!");
        System.out.println("Java is geweldig!");
        System.out.println("Java is geweldig!\n");

        //Opdracht 1.3
        System.out.print("Opdracht 1.3" + "\n");
        System.out.println("a	a^2	a^3	a^4");
        System.out.println("1	1	1	1");
        System.out.println("2	4	8	16");
        System.out.println("3	9	27	81");
        System.out.println("4	16	64	256\n");

        //Opdracht 1.4
        System.out.print("Opdracht 1.4" + "\n");
        double rekensom = (7.5*6.5-4.5*3) / (47.5*5.5);
        System.out.println(rekensom + "\n");


        // Opdracht 1.5
        System.out.print("Opdracht 1.5" + "\n");
        System.out.println(1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 + "\n");

        // Opdracht 1.6
        System.out.print("Opdracht 1.6" + "\n");
        double rekensom2 = 4 * (1 - 1.0/3 + 1.0/5 - 1.0/7 + 1.0/9 - 1.0/11 + 1.0/13);
        System.out.println(rekensom2 + "\n");

        // Opdracht 1.7
        System.out.print("Opdracht 1.7" + "\n");
        double rekensom3 = (6.5*6.5*3.14159);
        double rekensom4 = (2*6.5*3.14159);
        System.out.println("oppervlakte=" +  rekensom3);
        System.out.println("omtrek=" +  rekensom4 + "\n");

        // Opdracht 1.8
        System.out.print("Opdracht 1.8" + "\n");
        double rekensom5 = (5.3 * 8.6);
        double rekensom6 = 2 * (5.3 + 8.6 );
        System.out.println("oppervlakte="+ rekensom5);
        System.out.println("omtrek="+  rekensom6);

        }
    }
