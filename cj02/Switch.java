package com.techouts.cj02;
import java.util.Scanner;
public class Switch {
    void m1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter");
        int r = sc.nextInt();
        int age = r;
        switch (r) {
            case 1:
                System.out.print("eligibale");
                break;
            case 2:
                System.out.print("not at");
                break;
            case 3:
                System.out.print("ok");

            default:
                System.out.print("error");
        }

    }
        public static void main (String[]args){
            Switch obj = new Switch();
            obj.m1();

        }
    }
