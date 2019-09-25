package com.aerogramme.HelloWorld;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        // calculator application

        double num1 , num2, output;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your first number");
        num1 = scanner.nextDouble();

        System.out.println("Enter your second number");
        num2 = scanner.nextDouble();

        System.out.println("Enter operator (+,-,/, *");
        char operator = scanner.next().charAt(0);

        switch (operator){
            case '+':
                output = num1 + num2;
                System.out.println(num1 + " " + operator + " " + num2 + " = " + output);
                break;

            case '-':
                output = num1 - num2;
                System.out.println(num1 + " " + operator + " " + num2 + " = " + output);
                break;

            case '/':
                try {
                    output = num1 / num2;
                    System.out.println(num1 + " " + operator + " " + num2 + " = " + output);
                    break;
                }catch (Exception ex){
                    ex.printStackTrace();
                }


            case '*':
                output = num1 * num2;
                System.out.println(num1 + " " + operator + " " + num2 + " = " + output);
                break;

                default:
                    System.out.println("You have not entered anything for operation!");
                    return;

        }



    }
}
