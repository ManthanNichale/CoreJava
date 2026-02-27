package com.techouts.assignment_1.assignment_22;

public class Counter {
    private int count = 0;

    // Synchronized method
    public synchronized void incrementMethod() {
        count++;
        System.out.println(Thread.currentThread().getName() + " incrementMethod: " + count);
    }

    public void incrementBlock() {
        synchronized (this) {
            count++;
            System.out.println(Thread.currentThread().getName() + " incrementBlock: " + count);
        }
    }
}

