package com.aerogramme.HelloWorld;


import java.util.Scanner;

public class MainGeeks {

    public static void main(String[] args) {

        Geeks geeks =  new Geeks("Tuffy", 77, "Accra-Ghana");
        Geeks geeks1 = new Geeks("Atlanta");
        Geeks geeks2 = new Geeks("Nana", 45);
        Geeks geeks3 = new Geeks();

        System.out.println(geeks3.toString());

        System.out.println("***********************************************");

        System.out.println("The mame of the geek is :" + geeks.getName());
        System.out.println("The age of the geek is :" + geeks.getAge());
        System.out.println("The location of the geek is :" + geeks.getLocation());

        System.out.println("***********************************************");

        geeks.setAge(99);
        geeks.setName("Donald Trump");
        geeks.setLocation("Washington");

        System.out.println("The mame of the geek is :" + geeks.getName());
        System.out.println("The age of the geek is :" + geeks.getAge());
        System.out.println("The location of the geek is :" + geeks.getLocation());

        System.out.println("***********************************************");

        int results1 = Geeks.add(20, 50);
        if(results1 > 50){
            System.out.println("The results is greater than 50");
        }
        if(Geeks.add(20, 50) > 50){
            System.out.println("The results is greater than 50");
        }

        int results2 = Geeks.add(4,7,90);
        double results3 = Geeks.add(45,55);

        System.out.println("Results2 = " + results2);
        System.out.println("Results3 = " + results3);

        System.out.println("***********************************************");

        System.out.println("The first value is = " + Geeks.add(558, 356));
        System.out.println("The second value is = " + Geeks.add(558, 356, 363));
        System.out.println("The third is = " + Geeks.add(558, 356));


        Scanner scanner = new Scanner(System.in);







    }
}
