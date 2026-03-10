package com.techouts.assessment_2.assignment_5;

import java.io.File;
// they showing the file is present or not
public class FileExample {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\Manthan Ashru\\Desktop\\LC.txt");

        if(f.exists()) {
            System.out.println("File exists");
        } else {
            System.out.println("File not found");
        }
    }
}