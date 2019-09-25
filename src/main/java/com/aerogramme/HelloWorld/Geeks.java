package com.aerogramme.HelloWorld;

public class Geeks {

    private String name;
    private int age;
    private String location;

    public Geeks(){

    }


    public Geeks(String name, int age, String location) {
        this.name = name;
        this.age = age;
        this.location = location;
    }

    public Geeks(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Geeks(String location) {
        this.location = location;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


    @Override
    public String toString() {
        return "Geeks{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", location='" + location + '\'' +
                '}';
    }

    public int sum(int x, int y){
        return x+y;
    }


    public static int add(int x, int y){
        return x + y;
    }

    public static int add(int x, int y, int z){
        return x + y + z;
    }

    public static double add(double x, double y){
        return x + y;
    }


}
