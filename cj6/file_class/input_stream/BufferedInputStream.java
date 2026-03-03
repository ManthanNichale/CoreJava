package com.techouts.cj6.file_class.input_stream;

import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStream {

    public static void main(String[] args) throws IOException {

        java.io.BufferedInputStream bis =
                new java.io.BufferedInputStream(
                        new FileInputStream("C:\\Users\\Manthan Ashru\\Desktop\\rl.txt"));

        int r;

        while ((r = bis.read()) != -1) {
            System.out.print("Byte value: " + r);
            System.out.print("Character: " + (char) r);
        }

        bis.close();   // manually closing
    }
}