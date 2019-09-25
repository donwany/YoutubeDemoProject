package com.aerogramme.HelloWorld;

public class RelationalOperators {

    public static void main(String[] args) {

        int num1 = 100;
        int num2 = 200;

        if(num1 == num2){
            System.out.println("Num1 is equal to Num2");
        }else{
            System.out.println("Ooops they are not equal");
        }

        if(num1 != num2){
            System.out.println("Num1 is not equal to Num2");
        }else{
            System.out.println("Ooops they are not equal 2");
        }

        if(num1 > num2){
            System.out.println("Num1 is greater than num2");
        }else{
            System.out.println("Ooops num1 is not greater than num2");
        }

        if(num1 < num2){
            System.out.println("Num1 is less than num2");
        }else
            System.out.println("Ooops num1 is not less than num2");

        if(num1 <= num2){
            System.out.println("Num1 is less than num2");
        }else
            System.out.println("OOPS num1 is not greater than num2");



    }
}
