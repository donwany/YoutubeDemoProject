package com.aerogramme.HelloWorld;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterHandler {
    public static void main(String[] args) throws IOException {

        String filename = "/Users/ts5167/Documents/DemoProject/src/main/java/com/aerogramme/HelloWorld/demo2.txt";

        File file = new File(filename);


        if(file.exists()){
            try {
                FileWriter fw = new FileWriter(filename);
                fw.write("I am writing text to demo\n");
                fw.write("A\n");
                fw.write("Well done sir !\n");
                fw.append("appended\n");
                System.out.println("File written successfully");
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }else if(!file.exists()) {

            file.createNewFile();
            System.out.println(file.getName() +  ":" + " created successfully");
        }




    }
}
