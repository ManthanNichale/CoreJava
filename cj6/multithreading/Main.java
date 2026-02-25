package com.techouts.cj6.multithreading;

public class Main {

    public static void main(String[]args) throws InterruptedException{//inbelid thread is present
        First_Thread t = new First_Thread();
        t.start();//this start is call the run()
        for (int i=1;i<5;i++){
            System.out.println("Nichale");
            Thread.sleep(1000);
        }
    }
}
