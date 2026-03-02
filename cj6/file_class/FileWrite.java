package com.techouts.cj6.file_class;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
    public static void main(String[] args) {

        try (FileWriter f = new FileWriter("C:\\Users\\Manthan Ashru\\Desktop\\rl.txt")) {
            f.write("File is Loaded at a time");
            System.out.println("File written successfully.");
        }
        catch (IOException e) {
            System.out.println("Error writing file.");
        }

    }
}