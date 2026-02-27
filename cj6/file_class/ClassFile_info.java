package com.techouts.cj6.file_class;

import java.io.File;

public class ClassFile_info {
    static void main() {
        File f=new File("C:\\Users\\Manthan Ashru\\Desktop\\rl.text");
        if(f.exists()){
            System.out.println("File_name"+" "+ f.getName());
            System.out.println("File_Location"+" "+ f.getAbsolutePath());
            System.out.println("File_Location"+" "+ f.getAbsolutePath());
            System.out.println("File_Write"+" "+ f.canWrite());
            System.out.println("File_Read"+" "+ f.canRead());
            System.out.println("File_Size"+" "+ f.length());


        }
        else{
            System.out.println("File is not present ");
        }
    }
}
