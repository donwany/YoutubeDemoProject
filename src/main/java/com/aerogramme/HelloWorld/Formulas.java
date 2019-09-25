package com.aerogramme.HelloWorld;



public class Formulas {

    // define methods

    public static double AreaOfCircle(double radius){
       //double PI = 3.14;
       //return radius * radius * 3.14;
       return Math.pow(radius,2) * Math.PI;
    }

    public double Celius(double F){
        return (F-32) * 5/9;
    }

    public double Fareinheit(double C){
        return (C * 9/5) + 32;
    }

    public static double AreaOfTriangle(double base, double height){
        return  0.5 * base * height;
    }

}
