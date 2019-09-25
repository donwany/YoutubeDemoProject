package com.aerogramme.HelloWorld;

public class Arrays {

    public static void main(String[] args) {
        // arrays

        int [] arrs = new int[5];

        arrs[0] = 1;
        arrs[1] = 5;
        arrs[2] = 10;
        arrs[3] = 100;
        arrs[4] = 200;


        System.out.println(arrs[4] + arrs[0]);

        System.out.println("***************************************");

        for (int i = 0; i < arrs.length;i++){

            if(arrs[i] == 100){
                continue;
                //System.out.println("Elements in arrays = "+ arrs[i]);
            }
            System.out.println("Elements in arrays = "+ arrs[i]);

        }
        System.out.println("***************************************");

        int sum = 0;

        for (int i = 0;i < arrs.length;i++){
            sum = sum + arrs[i];
        }
        System.out.println("Total sum is = " + sum);


    }
}
