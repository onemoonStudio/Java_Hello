// 1로 만들기
// 3으로 으로 나누어지면 3으로 나눈다.
// 2로 나누어지면 2로 나눈다.
// 그게 아닌 경우 1을 뺀다.

package beakjoon.basic.C3DP1;

import java.util.Scanner;

public class MakeOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputInt = sc.nextInt();
        int result=0;

        // version 1
        while(inputInt > 1){
            if(inputInt%3 == 0 ){
                inputInt = inputInt/3;
            }else if (inputInt%3 == 1 && inputInt-1 > 0 ){
                inputInt = (inputInt -1)/3;
                result++;
            }else if (inputInt%2 == 0){
                inputInt = inputInt/2;
            }else{
                inputInt--;
            }
            result ++;
        }
        System.out.println(result);
    }

}

// 반례 321
