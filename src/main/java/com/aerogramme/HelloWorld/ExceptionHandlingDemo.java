package com.aerogramme.HelloWorld;

public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        // Exception Handling

        // try-catch-finally

      arithmetic();




    }

    public static void arithmetic(){
        try{

            int [] ages = {20, 40, 50,100};
            double results = ages[2]/0; // 50/0.0 or 50/0
            System.out.println(results);

        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("ArrayIndexOutOfBoundsException : " + ex.getMessage());
        }catch (ArithmeticException ex){
            System.out.println("ArithmeticException :" + ex.getStackTrace().toString());
        }finally {
            System.out.println("In the finally exception bracket");
        }

    }
}
