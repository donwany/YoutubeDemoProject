package com.aerogramme.HelloWorld;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadingDemo {

    public static void main(String[] args) throws FileNotFoundException {
        // reading files content

        String fileName = "/Users/ts5167/Documents/DemoProject/src/main/java/com/aerogramme/HelloWorld/demo-file.json";

        FileReader fr = new FileReader(fileName);

        int iterator;
        while (true){
            try {
                if (!((iterator = fr.read()) != -1)) break;
                System.out.print((char)iterator);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }
}
