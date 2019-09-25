package com.aerogramme.HelloWorld;

public class BikeMain {

    public static void main(String[] args) {
        // Call our parent and child class
        // Call our base and sub class

        Bicycle bicycle = new Bicycle(6, 5);
        bicycle.speed = 10;
        bicycle.gears = 7;

        bicycle.setGears(10);

        System.out.println("The bicycle has :" + bicycle.getSpeed()+ " speed");
        System.out.println("The bicycle has :" + bicycle.getGears()+ " gears");

        System.out.println(bicycle.toString());

        System.out.println("*********************************************************");

        MountainBike mountainBike = new MountainBike(12, 6, 50);

        System.out.println(mountainBike.toString());

        System.out.println("The mountain bike is traveling at : " + mountainBike.speeding(100) + "mph");
        System.out.println("The mountain bike is braking at : " + mountainBike.brake(20) + "mph");


    }
}
