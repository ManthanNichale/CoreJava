package com.techouts.cj6.file_class;

import java.io.File;
import java.io.IOException;

public class FileCreate {
    public static void main(String[] args) {

        try {
            File file = new File("C:\\Users\\Manthan Ashru\\Desktop\\rl.txt");

            if (file.createNewFile()) {
                System.out.println("File created successfully.");
            } else {
                System.out.println("File already exists.");
            }

        } catch (IOException e) {
            System.out.println("An error occurred.");
          //  e.printStackTrace();
        }

    }



}