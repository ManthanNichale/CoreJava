package com.techouts.assessment_2;
import java.nio.file.*;

public class Assignment_4 {
    public static void main(String[] args) throws Exception {

        Path p = Path.of("C:\\Users\\Manthan Ashru\\Desktop\\LC.txt");      // create path
        Files.writeString(p, "Hello");     // write to file

        String data = Files.readString(p); // read from file
        System.out.println(data);          // print

    }
}
