package com.aerogramme.HelloWorld;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

public class ReadingJSONFileDemo {

    public static void main(String[] args) {

        String path = "/Users/ts5167/Documents/DemoProject/src/main/java/com/aerogramme/HelloWorld/newJSONFile.json";

        JSONParser jsonParser = new JSONParser();
        try {
            Object obj = jsonParser.parse(new FileReader(path));

            JSONObject objson = (JSONObject)obj;

            System.out.println("Year:" + objson.get("year"));
            System.out.println("Name:" + objson.get("name"));
            System.out.println("Region:" + objson.get("region"));
            System.out.println("Department:" + objson.get("department"));
            System.out.println("Network:" + objson.get("network"));

            // retrieving values from json arrays

            System.out.println("***************************************");

            JSONArray arr = (JSONArray)objson.get("remarks");

            System.out.println(arr);

            for (Object list: arr){
                System.out.println("Elements in the remarks array is:" + list);
            }

            System.out.println("***************************************");

            System.out.println(((JSONArray) objson.get("remarks")).get(0));
            System.out.println(((JSONArray) objson.get("remarks")).get(1));
            System.out.println(((JSONArray) objson.get("remarks")).get(2));


        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }


    }
}
