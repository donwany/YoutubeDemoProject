package com.aerogramme.HelloWorld;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class FileHandler {

    public static void main(String[] args) {

        try {
            File file = new File("/Users/ts5167/Documents/DemoProject/src/main/java/com/aerogramme/HelloWorld/copy2.txt");

            if (file.createNewFile()) {
                System.out.println("New File is created!");
            } else {
                System.out.println("File already exists.");
                System.out.println(file.isDirectory());
                System.out.println(file.canRead());
                System.out.println(file.canWrite());
                System.out.println(file.getAbsoluteFile());
                System.out.println(file.getCanonicalFile());
                System.out.println(file.getPath());
                System.out.println(file.getAbsolutePath());
                System.out.println(file.getParent());
                System.out.println(file.listFiles());
                // rename file
                //file.renameTo(new File("/Users/ts5167/Documents/DemoProject/src/main/java/com/aerogramme/HelloWorld/copy3.txt"));
                System.out.println(file.lastModified());
                System.out.println(file.isFile());

                String path = file.getAbsolutePath();
                System.out.println(path + " exists ?" + file.exists());

                System.out.println("*************************************");

                File file1 = new File("/Users/ts5167/Documents/DemoProject/src/main/java/com/aerogramme/HelloWorld");

                ArrayList<File> dir = new ArrayList<>();

                File[] f = file1.listFiles();

                for(File fl: f){
                    dir.add(fl);
                }

                System.out.println(dir);
                System.out.println("*************************************");
                System.out.println(dir.get(0));
                System.out.println(dir.get(1));

                /* for(String files: fileList){
                    System.out.println(files);
                }*/
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
