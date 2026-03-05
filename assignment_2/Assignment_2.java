package com.techouts.assignment_2;
// Write a program to write data into a file using FileWriter.
import java.io.FileWriter;
import java.io.IOException;


    public class Assignment_2 {
        public static void main(String[] args) {

            try (FileWriter f = new FileWriter("C:\\Users\\Manthan Ashru\\Desktop\\LC.txt")) {
                f.write("Writing the data from the File \n");
                f.write("From the Java is ");
                System.out.println(" File written successfully.");
            }
            catch (IOException e) {
                System.out.println("not writing file.");
            }

        }
    }

