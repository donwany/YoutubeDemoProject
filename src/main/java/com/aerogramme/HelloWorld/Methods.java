package com.aerogramme.HelloWorld;

public class Methods {

    public static void main(String[] args) {

        // calling methods here

        double results = MethodsClass.multiply(50,45);
        System.out.println("Multiplication result is = " + results);
        System.out.println("The simplest way is = " + MethodsClass.multiply(50,45));

        System.out.println("****************************************************");

        int [] numbers = {1,3,4,5,6,7};

        int arrayresults = MethodsClass.sumArrays(numbers);
        System.out.println("The sum of the arrays is = " + arrayresults);

        System.out.println("****************************************************");

        System.out.println("Division of two numbers is = " + Math.round(MethodsClass.divide(67, 34)));

    }





}
