package com.aerogramme.HelloWorld;

import java.io.File;

public class DelRenameDemo {

    public static void main(String[] args) {
        // Rename and Delete files

        String fileName = "/Users/ts5167/Documents/DemoProject/src/main/java/com/aerogramme/HelloWorld/demo-file.json";

        File file = new File(fileName);

        // Rename
        boolean isRenamed = file.renameTo(new File("/Users/ts5167/Documents/DemoProject/src/main/java/com/aerogramme/HelloWorld/demo-file2.json"));

        if(isRenamed){
            System.out.println(file.getName() +  ":" + "File renamed successfully!");
        }

        // Delete
        File file1 = new File("/Users/ts5167/Documents/DemoProject/src/main/java/com/aerogramme/HelloWorld/demo-file2.json");
        boolean isDelete = file1.delete();

        if(isDelete){
                System.out.println(file1.getName() + ":" + "File Deleted Successfully!");
        }else{
            System.out.println(file1.getName() + ":" + "File Deletion Failed! Try again.");
        }






    }
}
