package beakjoon.basic.C3DP1;

import java.util.ArrayList;
import java.util.Scanner;

// 피보나치
// 답을 줄때 10007 을 나눈 나머지값을 달라고 하는데
// 결과를 출력할 때 뿐만 아니라. 더할때도 10007 로 나눠줘야 오버 플로우가 나지 않는다!

public class Tiling_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputInt = sc.nextInt();
        ArrayList<Integer> fibo = new ArrayList<>();

        if(inputInt < 3){
            System.out.println(inputInt);
        }else{
            fibo.add(1);
            fibo.add(2);
            for(int i=2;i<inputInt;i++){
                fibo.add(fibo.get(i-1) + fibo.get(i-2));
            }
            System.out.println(fibo.get(inputInt-1));
        }

    }
}
