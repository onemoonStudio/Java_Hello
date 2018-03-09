package com.javalec.thread_ex;

public class runnable_ex implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        System.out.println("runnable_ex");

        for( int i =0; i <10 ; i++){
            System.out.println("i = "+i);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
