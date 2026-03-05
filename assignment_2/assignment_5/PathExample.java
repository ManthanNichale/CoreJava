package com.techouts.assignment_2.assignment_5;
//showing the location or addrees of the folder

import java.nio.file.Path;
import java.nio.file.Paths;
public class PathExample {
    public static void main(String[] args) {
        Path p = Paths.get("C:\\Users\\Manthan Ashru\\Desktop\\LC.txt");
        System.out.println("File path: " + p);
    }
}