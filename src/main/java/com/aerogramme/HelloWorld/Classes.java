package com.aerogramme.HelloWorld;


public class Classes {

    // object-oriented programming

    // object is an instance of a class

   // 1. Polymorphism
   // 2. Inheritance
  //  3. Encapsulation
   // 4. Abstraction
  //  5. Class
    // 6. Methods/Functions
    // 7. Objects
    // 8. getters and setters
    // 9. constructors


    private String breed;
    private int age;
    private String color;

    public Classes(){

    }

    public Classes(String breed, int age, String color) {
        this.breed = breed;
        this.age = age;
        this.color = color;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Classes{" +
                "breed='" + breed + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
