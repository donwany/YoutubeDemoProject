package com.aerogramme.HelloWorld;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;


public class DatesDemo {

    public static void main(String[] args) {

        // Declare some local variables

        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(localDateTime);

        System.out.println("***************************");

        System.out.println("Year:" + localDateTime.getYear());
        System.out.println("Month:" + localDateTime.getMonth().getValue());
        System.out.println("Day:" + localDateTime.getDayOfMonth());
        System.out.println("Hour:" + localDateTime.getHour());
        System.out.println("Minute:" + localDateTime.getMinute());
        System.out.println("Seconds:" + localDateTime.getSecond());

        System.out.println("***************************");

        System.out.println("Date:" + localDateTime.getYear() + "-" + localDateTime.getMonthValue() + "-" + localDateTime.getDayOfMonth());

        // MONTH-DAY-YEAR OR YEAR-MONTH-DAY

        System.out.println("***************************");

        LocalDate localDate = LocalDate.of(2019, Month.JULY, 25);
        System.out.println(localDate);


        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MM-dd-YYYY");
        System.out.println(localDate.format(dateTimeFormatter));

        System.out.println("***************************");
        System.out.println(localDate.plusDays(2).plusYears(1).minusMonths(2));


    }
}
