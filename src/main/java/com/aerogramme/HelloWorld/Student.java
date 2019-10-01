package com.aerogramme.HelloWorld;

public class Student {

    public int roll_no;
    public String name;

    public Student(int roll_no, String name){
        this.roll_no = roll_no;
        this.name = name;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student[" +
                "roll_no=" + roll_no +
                ", name='" + name + '\'' +
                ']';
    }
}