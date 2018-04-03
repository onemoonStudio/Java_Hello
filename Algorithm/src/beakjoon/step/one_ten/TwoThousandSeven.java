// 2007 년 x월 y일의 요일을 구하시오
// 2007 년 1월 1일은 월요일이다.
// 출력은 영어로 MON TUE WEN THU FRI SAT SUN

// calendar get
// DAY_OF_WEEK 는 1이 일요일로 시작한다.
// MONTH 는 0이 1월
// DAY_OF_MONTH 는 1이 1일

package beakjoon.step.one_ten;

import java.util.Calendar;
import java.util.Scanner;

public class TwoThousandSeven {
    public static void main(String[] args) {
        String[] weekStr = {"MON","TUE","WEN","THU","FRI","SAT","SUN"};
        int[] dayOfMonth = {31,28,31,30,31,30,31,31,30,31,30,31};

        int count=0;
        Scanner sc = new Scanner(System.in);

        int inputMonth = sc.nextInt();
        int inputDay = sc.nextInt();

        if(inputMonth != 1){
            for(int i=0;i<inputMonth-1;i++){
                count += dayOfMonth[i];
            }
        }
        count += inputDay-1;
        System.out.println(count);

        // 1월 1일은 월요일이다 ! - 기준이 2번째 원소다.
        System.out.println(weekStr[count%7]);




//        // version 1 using calendar ( 제출했는데 틀림 - 왜 틀렸는지는 모르겠음 )
//        Calendar calendar = Calendar.getInstance();
//
//        Scanner sc = new Scanner(System.in);
//        int inputMonth = sc.nextInt();
//        int inputDay = sc.nextInt();
//
//        calendar.set(2007,inputMonth-1 , inputDay);
//        // set 할때 또한 0 부터 시작한다는 것을 잊지 말자
//        System.out.println(weekStr[ calendar.get(Calendar.DAY_OF_WEEK) - 1]);

    }
}
