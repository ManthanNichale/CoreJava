package com.techouts.cj6.file_class;

import java.io.*;
import java.util.Scanner;

public class Input_output {
    void m1() throws IOException {

           File f = new File("C:\\Users\\Manthan Ashru\\Desktop\\r.txt");

               System.out.println("File is created now");
        FileOutputStream o =new FileOutputStream(f);
      String  str="Java is programing ";

      o.write(str.getBytes());
        System.out.println("Insert the data");

        FileInputStream j = new FileInputStream(f);
        int ch;
        while ((ch=j.read())!=-1){
            System.out.print((char) ch);
        }

    }

    static void main() throws IOException {
        Input_output obj = new Input_output();
        obj.m1();
    }
}




