package com.api_test;

import java.util.*;

public class Mainclass {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Calendar API ");
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        int hour = calendar.get(Calendar.HOUR);
        int minute = calendar.get(Calendar.MINUTE);
        int seconds = calendar.get(Calendar.SECOND);

        System.out.println(year + "년 " +month+ "월 " + day + " 일");
        System.out.println(hour + "시 " +minute+ "분 " + seconds+ " 초");

        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        System.out.println("Random API");

        double d = Math.random();
        int di = (int)(d*10);
        System.out.println(d);
        System.out.println(di);
        Random randomClass = new Random();
        int r = randomClass.nextInt(100);
        System.out.println(r);

        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        System.out.println("StringTokenizer");

        String str1 = "안녕하세요 중앙대학교 학생 입니다.";

        StringTokenizer STokenizer = new StringTokenizer(str1);
        System.out.println(STokenizer.countTokens());

        while(STokenizer.hasMoreTokens()){
            System.out.println(STokenizer.nextToken());
        };
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        System.out.println("Timer API");

        Timer timer = new Timer(true);
//        TimerTask tt1 = new TimerTask1();
//        TimerTask tt2 = new TimerTask2();

//        timer.schedule(tt1,2000);
//        timer.schedule(tt2,5000);
        Thread.sleep(6000);
        // 만약 Thread sleep 이 없다면 timertask가 실행되는 시간을 기다리기 전 실행이 마무리 되기 때문에 종료된다.
        // 따라서 Thread sleep을 걸어줌으로서 timertask가 실행되는것을 기다린 후 나머지 코드를 실행할 수 있게끔 한다.
        System.out.println("Timer END");

    }
}
