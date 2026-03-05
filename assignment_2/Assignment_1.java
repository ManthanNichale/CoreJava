package com.techouts.assignment_2;
//Write a program to read a file line by line using BufferedReader.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Assignment_1 {

    public static void main(String[] args) {

        try {
            FileReader f = new FileReader("C:\\Users\\Manthan Ashru\\Desktop\\rl.txt");
            BufferedReader br = new BufferedReader(f);

            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }


        }
        catch (IOException e) {
            System.out.println(e);
        }

    }
}