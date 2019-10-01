package com.aerogramme.HelloWorld;

public class User {

    private String name;
    private int age;

    public User(){

    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public User setAge(int age) {
        this.age = age;
        return this;
    }

    public void getUserDetails(){
        System.out.println("Username is :" + name + " and " + age + "years old.");
    }

    @Override
    public String toString() {
        return "User[" +
                "name='" + name + '\'' +
                ", age=" + age +
                ']';
    }

    public static void main(String[] args) {

        User users = new User();

        users.setAge(22).setName("Donald Trump").getUserDetails();

        System.out.println(users.toString());

        System.out.println("User Age = " + users.getAge() + ", Username = " + users.getName());

        System.out.println("************************************************");

        new User().setName("Nana Akuffo Addo").setAge(75).getUserDetails();

    }
}



