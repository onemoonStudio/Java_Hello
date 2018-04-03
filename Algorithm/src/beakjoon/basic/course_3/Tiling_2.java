package beakjoon.basic.course_3;

import java.util.Scanner;

public class Tiling_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] resultArray = new int[1002];
        resultArray[1] = 1;
        resultArray[2] = 3;
        // n = n-1 + 2(n-2)

        int inputNum = sc.nextInt();
        for(int i=3;i<inputNum+1;i++){
            resultArray[i] = 2*resultArray[i-2]%10007 + resultArray[i-1]%10007 ;
            resultArray[i] %= 10007;
        }

        System.out.println(resultArray[inputNum]);


    }
}
