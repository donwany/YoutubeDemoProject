package com.aerogramme.HelloWorld;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWritingDemo {

    public static void main(String[] args) throws IOException {

        // File Writing Demo

        String path = "/Users/ts5167/Documents/DemoProject/src/main/java/com/aerogramme/HelloWorld/demo-file.json";

        String content = "I am happy I can now write to files in java\n. This is so cool to know. \n";

        File file = new File(path);

        if(file.exists()){
            // do something
            // we want to write some text to the this file
            FileWriter fw = new FileWriter(path);
            fw.write(content);
            fw.append("Appended text value\n");
            System.out.println(file.getName() + ":" + "File written successfully");

            //close filewriter stream
            fw.close();
            //fw.flush();

        }else if(!file.exists()){
            // do something
            // create a new file
            try {
                file.createNewFile();
                System.out.println(file.getName() + ":" + "File created successfully");
            } catch (IOException e) {
                e.printStackTrace();
            }

        }


    }
}
