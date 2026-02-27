package com.techouts.assignment_1.assignment_22;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();

        Thread t1 = new MyThread(counter);
        Thread t2 = new MyThread(counter);

        t1.setName("Thread-1");
        t2.setName("Thread-2");

        t1.start();
        t2.start();
    }
}
