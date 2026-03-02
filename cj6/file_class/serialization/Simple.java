package com.techouts.cj6.file_class.serialization;


//import com.techouts.assignment_1.assignment_8.Employee;

import java.io.*;

public class  Simple{

    static void main() throws IOException, ClassNotFoundException {
        Employees obj = new Employees(11,"rajiv");
        FileOutputStream s=new FileOutputStream("C:\\Users\\Manthan Ashru\\Desktop\\rl.text");
        ObjectOutputStream j = new ObjectOutputStream(s);
        j.writeObject(obj);
        FileInputStream fis = new FileInputStream("C:\\Users\\Manthan Ashru\\Desktop\\rl.text");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Employees e2 = (Employees) ois.readObject();
     //   ois.close();
      //  fis.close();
        System.out.println("ID: " + e2.id);
        System.out.println("Name: " + e2.name);

    }

}
