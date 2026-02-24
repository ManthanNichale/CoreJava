package com.techouts.cj6.thow;
import java.util.Scanner;
public class Demo_throw {
Scanner sc = new Scanner(System.in);
    void m1()  {
        System.out.println("Enter positive  number");
        int r =sc.nextInt();
        if(r<0){

             throw new ArithmeticException("not insert Negative"+" "+r);
        }
        else {
            System.out.println("Positive Number");
        }
    }
    public static void main(String []args)   {
        Demo_throw obj = new Demo_throw();
        obj.m1();
    }
}
