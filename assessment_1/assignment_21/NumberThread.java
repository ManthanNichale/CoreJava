package com.techouts.assessment_1.assignment_21;

class NumberThread extends Thread {
    public void run() {  // This method contains the thread code
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}
