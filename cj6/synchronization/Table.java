package com.techouts.cj6.synchronization;

public class Table {
 synchronized    void printTable(int n) {   // synchronized method
        for (int i = 1; i <= 10; i++) {
            System.out.println(n * i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}


