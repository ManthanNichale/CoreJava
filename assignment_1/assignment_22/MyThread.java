package com.techouts.assignment_1.assignment_22;

    class MyThread extends Thread {
        Counter counter;

        MyThread(Counter counter) {
            this.counter = counter;
        }

        public void run() {
            for (int i = 0; i < 3; i++) {
                counter.incrementMethod();
                counter.incrementBlock();
            }
        }
    }

