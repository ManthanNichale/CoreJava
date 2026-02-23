package com.techouts.cj5;

import java.util.Objects;
import java.util.Scanner;
public class Encapsulation {
    private String First_Name;
    private String  Medal_Name;
    private  String Last_Name;
   public String getFirst_Name(){


       return First_Name;
    }
    public void setFirst_Name(String First_Name){
       this.First_Name=First_Name;
    }
public String getMedal_Name(){

       return Medal_Name;
}
public void setMedal_Name(String Medal_Name){
       this.Medal_Name=Medal_Name;
}

    public String getLast_Name() {


        return Last_Name;

    }

    public void setLast_Name(String last_Name) {
        Last_Name = last_Name;
    }

    public static void main(String []args) {
        Encapsulation obj = new Encapsulation();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First_Name");
        String F= sc.nextLine();
        obj.setFirst_Name(F);

        System.out.println("Enter Medal_Name");
        String M= sc.nextLine();
        obj.setMedal_Name(M);

        System.out.println("Enter last_Name");
        String L= sc.nextLine();
        obj.setLast_Name(L);

        System.out.print(obj.getFirst_Name()+" "+obj.getMedal_Name()+" "+obj.getLast_Name());

    }
}
