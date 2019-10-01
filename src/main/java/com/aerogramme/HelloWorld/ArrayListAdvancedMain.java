package com.aerogramme.HelloWorld;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class ArrayListAdvancedMain {
    public static void main(String[] args) {

        Server server = new Server("https://google.com");

        // calling Server Class
        ArrayList<Server> URLS = new ArrayList<Server>();

        URLS.add(new Server("https://aerogramme.io"));
        URLS.add(new Server("https://fundmegh.com"));
        URLS.add(server);
        URLS.add(new Server("https://facebook.com"));

        System.out.println(URLS.size());
        System.out.println(URLS.remove(2));
        System.out.println(URLS);

        System.out.println("*********************************");

        System.out.println(URLS.isEmpty());

        System.out.println(server.getUrl());
        server.setUrl("HTTPS");

        System.out.println(server.toString());

        System.out.println("*********************************");


        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        System.out.println("DateTime:" + localDateTime.getYear() + "-" + localDateTime.getMonth().getValue() + "-" + localDateTime.getDayOfMonth());

        LocalDate date = LocalDate.of(2019, Month.SEPTEMBER, 25).plusYears(2).minusDays(2).minusMonths(2);
        System.out.println(date);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MM/dd/YYYY");
        System.out.println(date.format(dateTimeFormatter));



    }
}
