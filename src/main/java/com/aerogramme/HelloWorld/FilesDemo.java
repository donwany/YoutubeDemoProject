package com.aerogramme.HelloWorld;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FilesDemo {
    public static void main(String[] args) {

        File file = new File("com/aerogramme/HelloWorld/file.txt");
        System.out.println(file.getName());
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.getFreeSpace());
        System.out.println(file.getParent());
        System.out.println(file.getPath());
        System.out.println(file.length());

        System.out.println("*********************************");
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        System.out.println(file.isDirectory());

        if(file.exists()){
            System.out.println(file.listFiles());
            System.out.println(file.isHidden());
            System.out.println(file.isDirectory());
        }

        try {
            System.out.println(file.getCanonicalFile());
        } catch (IOException e) {
            e.printStackTrace();
        }


        boolean isSuccess = file.renameTo(new File("com/aerogramme/HelloWorld/file-new.txt"));
        if(isSuccess){
            System.out.println("File renamed successfully");
        }

        try{
            FileWriter writer = new FileWriter("com/aerogramme/HelloWorld/file.txt");
            writer.write("Data 1");
            writer.write("Data 2");

            writer.close();

        }catch (Exception ex){
            ex.printStackTrace();
        }

    }
}
