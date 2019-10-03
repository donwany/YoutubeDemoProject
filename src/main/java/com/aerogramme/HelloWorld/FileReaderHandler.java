package com.aerogramme.HelloWorld;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderHandler {

    public static void main(String[] args) throws IOException {

        FileReader filereadObj = new FileReader("/Users/ts5167/Documents/DemoProject/src/main/java/com/aerogramme/HelloWorld/demo.txt");

        int iterator;
        while((iterator = filereadObj.read())!= -1)
            System.out.print((char)iterator);

        try {
            filereadObj.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
