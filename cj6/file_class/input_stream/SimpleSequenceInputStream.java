package com.techouts.cj6.file_class.input_stream;
import java.io.*;


    public class SimpleSequenceInputStream {

        public static void main(String[] args) throws IOException {

            FileInputStream fis1 = new FileInputStream("C:\\Users\\Manthan Ashru\\Desktop\\r.txt");
            FileInputStream fis2 = new FileInputStream("C:\\Users\\Manthan Ashru\\Desktop\\r.txt");

            SequenceInputStream sis = new SequenceInputStream(fis1, fis2);

            int i;
            while ((i = sis.read()) != -1) {
                System.out.print((char) i);
            }

            sis.close();
            fis1.close();
            fis2.close();
        }
    }

