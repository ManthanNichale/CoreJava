package com.techouts.cj6.synchronization;

public class Main {
    public static void main(String args[]) throws InterruptedException {

        Table obj = new Table();   // One shared object

        Thread1 t1 = new Thread1(obj);
        Thread2 t2 = new Thread2(obj);

        t1.start();

        t2.join();
    }
}
