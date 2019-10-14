package com.aerogramme.HelloWorld;

public class StudentsController {

    private String firstname;
    private String lastname;
    private String title;
    private String course;
    private String age;

    public StudentsController(){

    }

    public StudentsController(String firstname, String lastname, String title, String course, String age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.title = title;
        this.course = course;
        this.age = age;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "StudentsController{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", title='" + title + '\'' +
                ", course='" + course + '\'' +
                ", age=" + age +
                '}';
    }
}
