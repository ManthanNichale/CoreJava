package com.techouts.assignment_2.assignment_5;
//To read, write, copy, delete, or check files using path
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;//toolbox to work with files

public class FilesExample {
    public static void main(String[] args) throws Exception {
        Path p = Paths.get("C:\\Users\\Manthan Ashru\\Desktop\\rl.txt");

        if(Files.exists(p)) {
            System.out.println("File exists");
            // Files.delete(p);
        } else {
            System.out.println("File does not exist");
        }
    }
}