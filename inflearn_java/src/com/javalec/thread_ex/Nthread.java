package com.javalec.thread_ex;

public class Nthread implements Runnable{

    int testNum = 0;

    @Override
    public void run() {
//    public synchronized void run() {
        // synchronized 를 통해서 A먼저 실행하게 한 뒤에 B가 실행되도록 할수 있다.
        for (int i = 0 ; i<10 ; i++){
            if(Thread.currentThread().getName().equals("A")){
                System.out.println("==================");
                testNum++;
            }
            System.out.println("Thread Name is : " + Thread.currentThread().getName() + " testNum : "+testNum);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

}
