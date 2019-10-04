package com.aerogramme.HelloWorld;

import java.io.IOException;
import java.util.List;

public class FileUtilsMain {

    public static void main(String[] args) throws IOException {
        // calling utils class

        String filename = "/Users/ts5167/Documents/DemoProject/src/main/java/com/aerogramme/HelloWorld/demo.txt";

        System.out.println(Utils.readTextFiles(filename));

        System.out.println("*****************************************");

        System.out.println(Utils.readTextFilesByLines(filename));
        System.out.println("*****************************************");

        List<String> list = Utils.readTextFilesByLines(filename);
        for(String lst: list){
            System.out.println(lst);
        }

        System.out.println("*****************************************");
        Utils.writeToTextFiles(filename, "NEW CONTENT IS HERE\n\t");


        System.out.println("************************************************");
        String input = Utils.readTextFiles(filename);
        Utils.writeToTextFiles("/Users/ts5167/Documents/DemoProject/src/main/java/com/aerogramme/HelloWorld/demo-file.txt", input);

    }
}
