package com.techouts.assignment_1.assignment_23;

class MyThread extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 3; i++) {
                System.out.println(getName() + " is running: " + i);
                Thread.sleep(500); // pause for 500 ms
            }

            synchronized (this) {
                notify(); // Notify waiting thread
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
