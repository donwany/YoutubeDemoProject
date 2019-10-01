package com.aerogramme.HelloWorld;

import java.util.HashMap;
import java.util.Map;

public class HashMapsDemo {

    public static void main(String[] args) {
        // declare hashmaps

        Map<String,String> map = createMap();

        System.out.println(map);

        System.out.println("***************************");

        System.out.println("Ghana is in west africa :" + map.get("Accra"));
        System.out.println(map.containsValue("Togo"));

        System.out.println(map.containsKey("Accra"));
        System.out.println(map.values());
        System.out.println(map.keySet());

        System.out.println(map.size());
        System.out.println(map.isEmpty());

        System.out.println("We are removing : " + map.remove("Moscow") + " Moscow from the hashmap");
        System.out.println("***************************************");

        map.forEach((K,V) -> System.out.println("Key:" + K + ", Value:" + V));

        HashMap<Integer, String> maps = new HashMap<>();
        maps.put(0, "Ghana");
        maps.put(1, "Russia");
        maps.put(2, "USA");

        System.out.println("***************************************");
        maps.forEach((K,V) -> System.out.println("Key:" + K + ", Value:" + V));

        maps.remove(1);

        System.out.println(maps.toString());
        System.out.println(maps.size());

        System.out.println(maps.replace(2,"USA", "United States of America"));

        System.out.println(maps.replace(3,"USA", "United States of America"));

        maps.forEach((K,V) -> System.out.println("Key:" + K + ", Value:" + V));



    }


    public static Map<String, String> createMap(){

        Map<String,String> map = new HashMap<>();
        //CITY -> COUNTRY
        map.put("Accra", "Ghana");
        map.put("Lome", "Togo");
        map.put("Abuja", "Nigeria");
        map.put("Moscow","Russia");

        return map;
    }

}
