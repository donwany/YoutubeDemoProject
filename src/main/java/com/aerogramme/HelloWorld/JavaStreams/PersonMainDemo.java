package com.aerogramme.HelloWorld.JavaStreams;

import com.aerogramme.HelloWorld.Gender;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PersonMainDemo {
    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        people.add(new Person("James Bond", 89, Gender.FEMALE));
        people.add(new Person("Theophilus Siameh", 90, Gender.MALE));
        people.add(new Person("John Doe", 100, Gender.FEMALE));
        people.add(new Person("Annie Cox", 89, Gender.MALE));
        people.add(new Person("Donald Trump", 45, Gender.FEMALE));
        people.add(new Person("Shaka Zulu", 23, Gender.MALE));
        people.add(new Person("Nana Addo", 75, Gender.FEMALE));

        List<Person> females = new ArrayList<>();

        for (Person person: people){
            if(person.getGender().equals(Gender.FEMALE)){
                females.add(person);
            }
        }

        females.forEach(System.out::println);

        System.out.println("***********************************");

        List<Person> oldPeople = new ArrayList<>();

        for (Person person: people){
            if(person.getAge() > 70 ){
                oldPeople.add(person);
            }
        }

        oldPeople.forEach(System.out::println);

        System.out.println("**************************************");

        List<Person> peopleStream = people.stream()
                .filter(person -> person.getGender().equals(Gender.FEMALE))
                .limit(2)
                .sorted()
                .collect(Collectors.toList());

        peopleStream.stream().forEach(System.out::println);



    }

}
