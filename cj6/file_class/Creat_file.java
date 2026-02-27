package com.techouts.cj6.file_class;
import java.io.*;
public class Creat_file {

   public  static void main(String[] args) {

       File f=new File("C:\\Users\\Manthan Ashru\\Desktop\\rl.text");

       try{
           if(f.createNewFile()) {
               System.out.println("File is Success");
           }
           else{
               System.out.println("Already");
           }

       }
       catch (IOException e){
           System.out.println("Exception Handal");
       }

   }
   }
