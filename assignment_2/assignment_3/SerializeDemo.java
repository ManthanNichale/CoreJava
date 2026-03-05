package com.techouts.assignment_2.assignment_3;
//write the file  object to stream.
import java.io.*;

public class SerializeDemo {
    public static void main(String[] args) {

        try {
            Student s = new Student();
            s.id = 1;
            s.name = "Manthan";

            FileOutputStream fos = new FileOutputStream("C:\\Users\\Manthan Ashru\\Desktop\\rl.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);//hold the file page

           oos.writeObject(s);


            System.out.println("Object serialized");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}