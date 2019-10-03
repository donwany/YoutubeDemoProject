package com.aerogramme.HelloWorld;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class FileHandlerDemo {

    public static void main(String[] args) {

        // File class

        File file = new File("/Users/ts5167/Documents/DemoProject/src/main/java/com/aerogramme/HelloWorld/demo.txt");

        boolean isExist = file.exists();

        if(isExist){
            // print some properties about this file
            System.out.println("Is directory: " + file.isDirectory());
            System.out.println("Get Parent: " + file.getParent());
            System.out.println("Get absolute Path: " + file.getAbsolutePath());
            System.out.println("GetName : " + file.getName());
            System.out.println("Is file: "+ file.isFile());
            System.out.println("Can write: " + file.canWrite());
            System.out.println("Can read: " + file.canRead());
            System.out.println("Last modified:" + file.lastModified());
            System.out.println("Get total Space: " + file.getTotalSpace());

        }else{
            // create a new file - demo.txt
            try {
                file.createNewFile();
                System.out.println("File created successfully!");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        System.out.println("****************************************************\n");
        File file1 = new File("/Users/ts5167/Documents/DemoProject/src/main/java/com/aerogramme/HelloWorld");

        File[] filesDir = file1.listFiles();

        ArrayList<File> DIR = new ArrayList<>();

        for(File files : filesDir){
            //System.out.println(files);
            DIR.add(files);
        }

        System.out.println(DIR);

        System.out.println("***************************");

        if(!DIR.isEmpty()){
            System.out.println(DIR.get(0));
            System.out.println(DIR.get(1));
            System.out.println(DIR.get(2));
        }


        System.out.println("***************************");

        ArrayList<String> DIR2 = new ArrayList<>();

        // getting the filenames only
        String[] names = file1.list();
        for (String filenames: names){
            //System.out.println(filenames);
            DIR2.add(filenames);
        }

        System.out.println(DIR2);
        if(!DIR2.isEmpty()){
            System.out.println(DIR2.get(0));
            System.out.println(DIR2.get(1));
            System.out.println(DIR2.get(2));
        }

    }
}
