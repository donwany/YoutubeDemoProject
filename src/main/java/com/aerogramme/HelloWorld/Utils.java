package com.aerogramme.HelloWorld;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Utils{

    // define some static methods

    // READFILES
    public static String readTextFiles(String filename) throws IOException{
        String content =  new String(Files.readAllBytes(Paths.get(filename)));
        return content;
    }

    // READFILESBYLINES
    public static List<String> readTextFilesByLines(String filename) throws IOException{
        List<String> list = Files.readAllLines(Paths.get(filename));
        return list;
    }

    // WRITEFILES
    public static void writeToTextFiles(String filename, String content) throws IOException{
        Files.write(Paths.get(filename), content.getBytes(), StandardOpenOption.CREATE);
    }

    // DELETE FILES
    public static void deleteTextFiles(String filename) throws IOException{

        boolean isDelete = Files.deleteIfExists(Paths.get(filename));

        if(isDelete){
            System.out.println(filename + " Deleted Successfully");
        }else{
            System.out.println(filename + " Deletion failed, try again!");
        }
    }



}
