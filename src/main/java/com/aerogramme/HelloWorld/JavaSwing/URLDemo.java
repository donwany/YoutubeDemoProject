package com.aerogramme.HelloWorld.JavaSwing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class URLDemo {

    public static void main(String[] args) throws MalformedURLException {


        String API = "https://api.openweathermap.org/data/2.5/weather?zip=75230,us&APPID=ef87d951c241d199580955e7e7478ed7";

        URL url4 = new URL(API);
        try {
            HttpURLConnection connection = (HttpURLConnection) url4.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Accept","application/json");
            connection.setDoOutput(true);

            int code = connection.getResponseCode();
            if(code != 200){
                System.out.println("connection failed");
            }

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String output;

            StringBuilder response = new StringBuilder();

            while ((output = bufferedReader.readLine()) != null) {

                response.append(output);
            }

            System.out.println(response.toString());

            System.out.println(url4.toString());
            System.out.println();
            System.out.println("Different components of the URL3-");
            System.out.println("Protocol:- " + url4.getProtocol());
            System.out.println("Hostname:- " + url4.getHost());
            System.out.println("Default port:- " + url4.getDefaultPort());
            System.out.println("Query:- " + url4.getQuery());
            System.out.println("Path:- " + url4.getPath());
            System.out.println("File:- " + url4.getFile());
            System.out.println("Reference:- " + url4.getRef());

            // disconnect connection
            connection.disconnect();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
