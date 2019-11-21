package com.aerogramme.HelloWorld.JavaStreams;

import com.aerogramme.HelloWorld.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamsDemo {

    public static void main(String[] args) {

        List<Students> listStudents = new ArrayList<>();
        List<Students> listBadStudents = new ArrayList<>();

        listStudents.add(new Students("Alice", 82));
        listStudents.add(new Students("Bob", 90));
        listStudents.add(new Students("Carol", 67));
        listStudents.add(new Students("David", 80));
        listStudents.add(new Students("Eric", 55));
        listStudents.add(new Students("Frank", 49));
        listStudents.add(new Students("Gary", 88));
        listStudents.add(new Students("Henry", 98));
        listStudents.add(new Students("Ivan", 66));
        listStudents.add(new Students("John", 52));



        for (Students student: listStudents) {

            if(student.getScore() > 70) {

                System.out.println(student);
            }
        }

        System.out.println("******** BAD STUDENTS *********************");


        for (Students students: listStudents) {

            if(students.getScore() < 70) {

                listBadStudents.add(students);
                System.out.println(students);
            }
        }

        System.out.println("*********** JAVA STREAMS *****************");

        // find students whose score >= 70
        List<Students> listStreamGoodStudents = listStudents.stream()
                .filter(s -> s.getScore() > 70)
                .collect(Collectors.toList());


        listStreamGoodStudents.stream().forEach(System.out::println);

        System.out.println("***********************************");

        // calculate average score of all students
        double average = listStudents.stream()
                .mapToInt(s -> s.getScore()).average().getAsDouble();

        System.out.println("Average score: " + average);


        System.out.println("***********************************");

        List<Students> top5Students = listStudents.stream()
                .filter(s -> s.getScore() >= 70)
                .sorted()
                .limit(5).collect(Collectors.toList());

        System.out.println("Top 5 Students by Score:");
        top5Students.forEach(s -> System.out.println(s));
    }
}
