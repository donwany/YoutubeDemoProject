package com.aerogramme.HelloWorld;

public class FormulaClass {
    public static void main(String[] args) {

        Formulas formulas = new Formulas();
        System.out.println("Temperature in Celcius is = " + formulas.Celius(98));
        System.out.println("Temperature in Fareinheit is = " + formulas.Fareinheit(27));

        System.out.println("*******************************************************************");

        // calling static methods
        System.out.println("The area of the circle is = " + Formulas.AreaOfCircle(100));
        System.out.println("The area of the triangle is = " + Formulas.AreaOfTriangle(200, 5000));

    }
}
