package com.aerogramme.HelloWorld;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CSVReaderDemo {

    private static StudentsController controller = new StudentsController();

    public static void main(String[] args) throws IOException {

        String path = "/Users/ts5167/Documents/DemoProject/src/main/java/com/aerogramme/HelloWorld/csvfile.csv";
        String sep = ",";
        String line;

        try {
            BufferedReader br = new BufferedReader(new FileReader(path));

            while ((line = br.readLine()) != null){

                String[] names = line.split(sep);

                //System.out.println("FirstName:" + names[0] + ", LastName:" + names[1] + ", Title:" + names[2] + ", Course:" + names[3] + ", Age:" + names[4]);

                controller.setFirstname(names[0]);
                controller.setLastname(names[1]);
                controller.setTitle(names[2]);
                controller.setCourse(names[3]);

                try {
                    controller.setAge(names[4]);
                }catch (NumberFormatException ex){

                }

                System.out.println("FirstName:" + controller.getFirstname() + ", LastName:" + controller.getLastname()
                        + ", Title:" + controller.getTitle() + ", Course:" + controller.getCourse() + ", Age:" + controller.getAge());

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }

}
