package com.company;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileInput {
    public static void main(String[] args) {

try{
        String filename = "newFile.txt";
        String workingDirectory = System.getProperty("user.dir");

        System.out.println(workingDirectory.toString());
        File file = new File(workingDirectory, filename);

        //****************//

        System.out.println("Final filepath : " + file.getAbsolutePath());
        if (file.createNewFile()) {
            System.out.println("File is created!");
        } else {
            System.out.println("File is already existed!");
        }

    } catch (IOException e) {
        e.printStackTrace();
    }
}
}
