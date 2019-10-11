package com.aerogramme.HelloWorld;

public class LineArgument {

    public static void main(String[] args) {

        String[] fruits = {"Mango", "Banana", "Apple"};

        System.out.println(fruits[0]);
        System.out.println(fruits[1]);
        System.out.println(fruits[2]);

        System.out.println("*******************************");

        if(args.length > 0){

            String first_number = args[0];
            String second_number = args[1];
            String file_path = args[2];


            // parse these variables
            int first = Integer.parseInt(first_number);
            int second = Integer.parseInt(second_number);

            int total = first + second;
            System.out.println("Total sum is :" + total);

            System.out.println("*******************************");
            System.out.println("Multiplication of two numbers is :" + multiply(first, second));

            System.out.println("*******************************");
            System.out.println("File path is :" + file_path);

        }


    }

    public static double multiply(double number1, double number2){
        double out = (number1 * number2)/1919;
        return  Math.round(out);
    }

    // java -cp /Users/ts5167/Documents/CommandLineDemo/target/CommandLineDemo-1.0-SNAPSHOT.jar \
    // com.fundmegh.CommandDemo \
    // 7839 2500 /Users/ts5167/Desktop/file.txt

}

