package com.aerogramme.HelloWorld;

public class StudentGFG {

    public static void main(String[] args) {

        Student [] arr = new Student[]{ new Student(1,"John"),new Student(2, "Doe")};

        //arr[0] = new Student(1,"John");
        //arr[1] = new Student(2, "Doe");

        for(int i = 0; i < arr.length;i++){
            System.out.println(arr[i].getRoll_no() + "," + arr[i].getName());
        }
    }
}
