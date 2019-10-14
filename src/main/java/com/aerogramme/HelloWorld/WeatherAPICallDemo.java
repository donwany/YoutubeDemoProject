package com.aerogramme.HelloWorld;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DecimalFormat;

public class WeatherAPICallDemo {

    public static  double kelvin2Cel(double kelvin){
        DecimalFormat format = new DecimalFormat("0.00");
        return Double.parseDouble(format.format(kelvin - 273.15));
    }


    public static void main(String[] args) throws IOException {

        String API = "https://api.openweathermap.org/data/2.5/weather?zip=45449,us&APPID=ef87d951c241d199580955e7e7478ed7";

        try {
            URL url = new URL(API);

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setDoOutput(true);
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Accept","application/json");

            int responseCode = connection.getResponseCode();
            if(responseCode != 200){
                System.out.println("HTTP response code error:" + responseCode);
            }

            String line;

            StringBuilder response = new StringBuilder();

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            while ((line = bufferedReader.readLine()) != null){
                response.append(line);
            }

            System.out.println(response);

            JSONParser parser = new JSONParser();

            try {
                Object obj = parser.parse(response.toString());

                // retrieving values from main object
                JSONObject mainObj = (JSONObject)obj;
                Object newObj = mainObj.get("main");

                JSONObject objValues = (JSONObject)newObj;

                double temp  = (double) objValues.get("temp");

                System.out.println("Temperature at Dallas is :" + kelvin2Cel(temp));

                // retrieving coordinates
                JSONObject coordObj = (JSONObject)obj;
                Object newCordObj = coordObj.get("coord");
                JSONObject coord = (JSONObject)newCordObj;

                double longitude = (double) coord.get("lon");
                double latitude = (double) coord.get("lat");

                System.out.println("Latitude is :" + latitude +", and " + "Longitude is:" + longitude);



            } catch (ParseException e) {
                e.printStackTrace();
            }


        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

    }
}
