package beakjoon.basic.course_3;

import java.util.Scanner;

public class PinaryNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNum = sc.nextInt();
        long resultArr[] = new long[91];
        resultArr[1] = 1;
        resultArr[2] = 1;

        for(int i=3; i<inputNum+1;i++){
            resultArr[i] = resultArr[i-1] + resultArr[i-2];
            System.out.println(" i  : " + i + " and result "+resultArr[i]);
        }

        System.out.println(resultArr[inputNum]);
    }
}

// version 1
// 피보나치가 아닌것 같음 x
// long 을 생각을 못함 21억이 넘어가므로 long으로 하면 된다.
