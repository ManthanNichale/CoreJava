package com.techouts.assignment_1.assignment_23;

    public class Main {
        public static void main(String[] args) throws InterruptedException {
            MyThread t1 = new MyThread();
            MyThread t2 = new MyThread();

            // Thread class methods
            t1.setName("Thread-1");
            t2.setName("Thread-2");
            t1.setPriority(Thread.MAX_PRIORITY); // set priority

            t1.start(); // start thread
            synchronized (t1) {
                t1.wait(); // wait until t1 calls notify
            }

            t2.start(); // start second thread
            t2.join();  // main thread waits for t2 to finish

            System.out.println("Main thread ends");
        }
    }

