package com.aerogramme.HelloWorld;

public class MainClass {

    public static void main(String[] args) {

        // calling classes

        Classes dogClass = new Classes("German Shepherd", 20, "White");

        System.out.println("The age of the dog is = " + dogClass.getAge());
        System.out.println("The breed of the dog is = " + dogClass.getBreed());
        System.out.println("The color of the dog is = " + dogClass.getColor());

        dogClass.setAge(25);
        dogClass.setBreed("Tuffy");
        dogClass.setColor("Black");

        System.out.println("**************************************************");

        System.out.println("The age of the dog is = " + dogClass.getAge());
        System.out.println("The breed of the dog is = " + dogClass.getBreed());
        System.out.println("The color of the dog is = " + dogClass.getColor());

        System.out.println("**************************************************");
        System.out.println(dogClass.toString());

        // another class object
        Classes dog = new Classes();
        dog.setBreed("Ghana Breed");
        dog.setAge(62);
        dog.setColor("RedGoldGreen");

        System.out.println("**************************************************");

        System.out.println("The age of the dog is = " + dog.getAge());
        System.out.println("The breed of the dog is = " + dog.getBreed());
        System.out.println("The color of the dog is = " + dog.getColor());
        System.out.println(dog.toString());




    }
}
