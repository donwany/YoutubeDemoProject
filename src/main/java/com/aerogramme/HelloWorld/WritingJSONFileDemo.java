package com.aerogramme.HelloWorld;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class WritingJSONFileDemo {

    public static void main(String[] args) {

        JSONObject object = new JSONObject();

        object.put("year", 5);
        object.put("network","MTN");
        object.put("region","VOLTA");
        object.put("name", "Elorm Beenine Man");
        object.put("department","Animal Farm");

        System.out.println(object);

        JSONArray array = new JSONArray();
        array.add("Maths");
        array.add("Software");
        array.add("Science");

        // want to add this array to our JSONObject object
        object.put("remarks", array);

        System.out.println("**********************************");
        System.out.println(object);

        try {
            FileWriter fileWriter = new FileWriter("/Users/ts5167/Documents/DemoProject/src/main/java/com/aerogramme/HelloWorld/newJSONFile.json");

            fileWriter.write(object.toJSONString());

            fileWriter.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
