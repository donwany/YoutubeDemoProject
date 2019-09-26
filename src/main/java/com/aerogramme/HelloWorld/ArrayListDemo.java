package com.aerogramme.HelloWorld;


import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {

        // ArrayList

        ArrayList<String> arrayList = new ArrayList<String>(5);
        arrayList.add(0, "JAVA");
        arrayList.add(1, "C++");
        arrayList.add(2, "Python");
        arrayList.add(3, "C#");
        arrayList.add(4, "PHP");


        ArrayList<Integer> arr = new ArrayList<Integer>(3);
        arr.add(0, 100);
        arr.add(1, 300);
        arr.add(2, 500);

        for(int i = 0; i<= 3; i++){
            arr.add(i);
        }

        System.out.println(arr);

        System.out.println("***********************");

        System.out.println(arrayList);

        arrayList.remove(4);

        System.out.println("***********************");

        System.out.println(arrayList);

        System.out.println("Size is = " + arrayList.size());

        for(int i = 0; i < arrayList.size();i++){
            System.out.println("Element in arraylist is: " + arrayList.get(i));
        }

        System.out.println("***********************");

        System.out.println(arrayList.contains("JAVA"));
        System.out.println(arrayList.add("SCALA"));

        for(int i = 0; i < arrayList.size();i++){
            System.out.println("Element in arraylist is: " + arrayList.get(i));
        }


    }
}
