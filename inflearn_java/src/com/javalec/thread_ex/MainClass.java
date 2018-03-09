package com.javalec.thread_ex;

public class MainClass {
    public static void main(String[] args) {

//        runnable_ex thread_ex = new runnable_ex();
//
//        Thread second_thread = new Thread(thread_ex , "A");
//        second_thread.run();



//        ExtendsThread third_thread = new ExtendsThread();
//        third_thread.setName("B");
//        third_thread.run();
//
//        System.out.println(Thread.currentThread().getName());


        Nthread nthread = new Nthread();
        // 주의할점 Thread는 다르지만 하나의 객체에서 만드는 쓰레드 이기 때문에
        // testNum 이 공유되었다는 사실을 인지하자.
        // 원하는 대로 결과를 만들고 싶다면 2개의 객체를 만들고 각각 설정한다.
        // 아래 2개 라인처럼 말이다.
        // Nthread nthread1 = new Nthread();
        // Nthread nthread2 = new Nthread();


        Thread thread1 = new Thread(nthread,"A");
        Thread thread2 = new Thread(nthread,"B");

        thread1.start();
        thread2.start();
        System.out.println(Thread.currentThread().getName());

    }
}
