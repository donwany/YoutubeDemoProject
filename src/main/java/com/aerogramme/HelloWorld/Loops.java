package com.aerogramme.HelloWorld;

public class Loops {


    public static void main(String[] args) {
        // for loops

        System.out.println("first number is = " + 1);
        System.out.println("second number is = " + 2);
        System.out.println("third number is = " + 3);
        System.out.println("fourth number is = " + 4);
        System.out.println("fifth number is = " + 5);
        System.out.println("hundredth number is = " + 100);


       /* for(int i = 1;i <= 100;i++){
            System.out.println("Count of number is = " + i);
        }*/

       /* for(int i = 100; i >= 5; i-=2){
            System.out.println("Count of number is = " + i);
        }*/

        int [] arrs = {1,3,5,6,9,8};

       /* for (int i = 0; i < arrs.length;i++){
            System.out.println("Elements in arrays = " + arrs[i]); // arrs[o]
        }*/

        for (int numbers:arrs) {
            System.out.println("Elements in arrays = " + numbers);
        }





    }
}
