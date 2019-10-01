package com.aerogramme.HelloWorld;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FilesMain {

    public static void main(String[] args) {

        try {

            String input = FilesUtil.readTextFile("/Users/ts5167/Documents/DemoProject/src/main/java/com/aerogramme/HelloWorld/file.txt");
            System.out.println(input);

            FilesUtil.writeToTextFile("/Users/ts5167/Documents/DemoProject/src/main/java/com/aerogramme/HelloWorld/copy.txt", input);

            System.out.println(FilesUtil.readTextFile("/Users/ts5167/Documents/DemoProject/src/main/java/com/aerogramme/HelloWorld/copy.txt"));

            System.out.println(FilesUtil.readTextFileByLines("/Users/ts5167/Documents/DemoProject/src/main/java/com/aerogramme/HelloWorld/file.txt"));

            // DeleteFiles
            //FilesUtil.deleteTextFiles("/Users/ts5167/Documents/DemoProject/src/main/java/com/aerogramme/HelloWorld/copy.txt");


            //System.out.println(Task.Status.COMPLETED);

            System.out.println(new Task(1020,"Checking on the CD","Faulty drive", Task.Status.CREATED, 25).getStatus());
            System.out.println(new Task(1021,"Checking on the CD","Faulty drive", Task.Status.COMPLETED, 2).getDescription());
            System.out.println(new Task(1022,"Checking on the CD","Faulty drive", Task.Status.ASSIGNED, 12).getSummary());
            System.out.println(new Task(1022,"Checking on the CD","Faulty drive", Task.Status.ASSIGNED, 12).toString());


            List<Task> list = new ArrayList<Task>();

            for (int i = 0; i < 20; i++) {
                list.add(new Task(i, "Test1", "Test2", Task.Status.ASSIGNED, 10));
            }

            list.forEach((v) -> System.out.println(v));



        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
