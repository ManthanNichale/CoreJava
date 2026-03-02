package com.techouts.cj6.file_class;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileRead {
    public static void main(String[] args) {

        try {
            File file = new File("C:\\Users\\Manthan Ashru\\Desktop\\rl.txt");
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {
                String data = sc.nextLine();
                System.out.println(data);
            }



        } catch (FileNotFoundException e) {
            System.out.println("File not found.");

        }

    }
}