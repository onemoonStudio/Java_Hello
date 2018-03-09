package com.javalec.thread_ex;

public class ExtendsThread extends Thread{

    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName());

        for(int i = 0 ; i < 10 ; i++ ){
            System.out.println("i = " + i);
            try{Thread.sleep(500);}catch (Exception e){e.getStackTrace();}
        }
    }

}
