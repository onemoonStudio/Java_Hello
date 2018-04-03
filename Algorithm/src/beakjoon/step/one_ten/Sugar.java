package beakjoon.step.one_ten;

import java.util.Scanner;

public class Sugar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = -1;
        int howManySugar = sc.nextInt();

        int forFive = howManySugar/5;

        for(int i=forFive;i>-1;i--){

            int leftSugar = howManySugar - 5*i;
            // @1
            if(leftSugar ==0){
                result = i;
                break;
            }
            if(leftSugar%3 == 0 && leftSugar/3 != 0){
                result = leftSugar/3 + i;
                break;
            }
        }
        // for문 하나로 체크할 수 있음

        System.out.println(result);

    }
}
// @1 1번째 실수 만약 5로 다 나눠줬을 때 break를 생각하지 못했다. 한마디로 5로 나눠지는 경우 체크를 안함
