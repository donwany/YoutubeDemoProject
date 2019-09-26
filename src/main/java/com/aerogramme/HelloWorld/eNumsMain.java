package com.aerogramme.HelloWorld;


public class eNumsMain {

    public static void main(String[] args) {

        Weekdays weekdays = Weekdays.MONDAY;

        switch (weekdays){
            case MONDAY:
                System.out.println("Today is Monday");
                break;
            case TUESDAY:
                System.out.println("Today is Tuesday");
                break;
            case WEDNESDAY:
            case THURSDAY:
            case SUNDAY:
            case SATURDAY:
            case FRIDAY:
                System.out.println("Today is Friday and also a holiday");
                break;
                default:
                    System.out.println("Unknown Weekday");
                    break;
        }

        Gender[] gender = Gender.values();
        for(Gender val: gender){
            System.out.println("The name is =" + val + ",at index of =" + val.ordinal());
        }

        System.out.println("*****************************************************************");


        Weekdays[] weekdays1 = Weekdays.values();
        for(Weekdays days: weekdays1){
            System.out.println("The name of weekday is :" + days + ",at index of : " + days.ordinal());
        }

    }
}
