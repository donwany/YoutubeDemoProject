package com.aerogramme.HelloWorld;

public class switchStatements {

    public static void main(String[] args) {


        // switch statements

        int day = 4;
        String dayOfWeek;

        switch (day){
            case 1: dayOfWeek = "Monday";
                System.out.println("Day of week is =:" + dayOfWeek);
                break;
            case 2: dayOfWeek = "Tuesday";
                System.out.println("Day of week is =:" + dayOfWeek);
                break;
            case 3: dayOfWeek = "Wednesday";
                System.out.println("Day of week is =:" + dayOfWeek);
                break;
            case 4: dayOfWeek = "Thursday";
                System.out.println("Day of week is =:" + dayOfWeek);
                break;
            case 5: dayOfWeek = "Friday";
                System.out.println("Day of week is =:" + dayOfWeek);
                break;
            case 6: dayOfWeek = "Saturday";
                System.out.println("Day of week is =:" + dayOfWeek);
                break;
            case 7: dayOfWeek = "Sunday";
                System.out.println("Day of week is =:" + dayOfWeek);
                break;
            default:dayOfWeek = "Unknown";
                System.out.println("Day of week is =:" + dayOfWeek);
                break;
        }


    }
}
