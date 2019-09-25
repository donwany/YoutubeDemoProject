package com.aerogramme.HelloWorld;

public class IfElseStatement {

    public static void main(String[] args) {

        // if-else statements

        scoresMethod(76);


    }

    public static void scoresMethod(int scores){
        //int scores = 76;
        char grade ;

        if (scores >= 90){
            grade = 'A';
        }else if(scores >= 80){
            grade = 'B';
        }else if(scores >= 70){
            grade = 'C';
        }else if(scores >= 60){
            grade = 'D';
        }else{
            grade = 'F';
        }

        System.out.println("The grade of the student is: " + grade);
    }
}
