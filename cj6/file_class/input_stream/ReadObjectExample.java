package com.techouts.cj6.file_class.input_stream;
import java.io.*;

// Student class must implement Serializable
class Student implements Serializable {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class ReadObjectExample {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        // First, write an object to file
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.dat"));
        Student s1 = new Student(101, "Rahul");
        oos.writeObject(s1);
        oos.close();

        // Now, read the object from file using ObjectInputStream
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.dat"));
        Student s2 = (Student) ois.readObject();  // Deserialization
        ois.close();

        // Display object data
        System.out.println("ID: " + s2.id);
        System.out.println("Name: " + s2.name);
    }
}