package com.aerogramme.HelloWorld;

public class UserProfile {
    private String name;
    private int age;

    public UserProfile(){

    }

    public UserProfile(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public UserProfile setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public UserProfile setAge(int age) {
        this.age = age;
        return this;
    }

    public void getUserDetails(){
        System.out.println("Username = " + name + ", and age = " + age);
    }

    @Override
    public String toString() {
        return "UserProfile[" +
                "name='" + name + '\'' +
                ", age=" + age +
                ']';
    }

    public static void main(String[] args) {

        // call userprofile class here

        UserProfile profile = new UserProfile();
        profile.setAge(22);
        profile.setName("Donald Trump");
        profile.getUserDetails();

        System.out.println(profile.toString());

        System.out.println("******** Method Chaining ********************");

        UserProfile userProfile = new UserProfile();
        userProfile.setAge(77).setName("Donald Trump Wicked").getUserDetails();

        System.out.println(userProfile.setAge(75).setName("Nana Addo").getAge());

        System.out.println("*************************************************");

        new UserProfile().setAge(103).setName("JJ Rawlings").getUserDetails();

    }

}
