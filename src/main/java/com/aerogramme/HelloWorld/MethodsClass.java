package com.aerogramme.HelloWorld;

public class MethodsClass {

    // a simple method

    public static double multiply(double x, double y){
        double result = x * y;
        return  result;
    }

    public static  int sumArrays(int[] numbers){
        int sum = 0;
        for (int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }
        return  sum;
    }

    public  static  double divide(double number1, double number2){
        return  number1/number2;
    }


}
