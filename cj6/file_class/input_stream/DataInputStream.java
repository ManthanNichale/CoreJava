package com.techouts.cj6.file_class.input_stream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInputStream {

    public static void main(String[] args) throws IOException {

        java.io.DataInputStream dis =
                new java.io.DataInputStream(new FileInputStream("C:\\Users\\Manthan Ashru\\Desktop\\rl.txt"));

        int number = dis.readInt();
        String text = dis.readUTF();

        System.out.println("Number: " + number);
        System.out.println("Text: " + text);

        dis.close();
    }
}