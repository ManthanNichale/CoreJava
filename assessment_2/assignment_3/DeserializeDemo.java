package com.techouts.assessment_2.assignment_3;

import java.io.*;
//read the file  stream to object
public class DeserializeDemo {
    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\Manthan Ashru\\Desktop\\rl.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Student s = (Student) ois.readObject();

            System.out.println("ID: " + s.id);
            System.out.println("Name: " + s.name);


        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
