package beakjoon.basic.C3DP1;

import java.util.Arrays;
import java.util.Scanner;

public class EasyStairNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int resultArr[][] = new int[102][9];
        Arrays.fill(resultArr[1] , 1);
        resultArr[2] = new int[]{2,2,2,2,2,2,2,2,1};

        int inputNum = sc.nextInt();
        for(int i=3;i<inputNum+1;i++){
            resultArr[i][0] = resultArr[i-1][1] + resultArr[i-2][0];
            resultArr[i][0] %= 1000000000;

            for(int j=1;j<8;j++){
                resultArr[i][j] = resultArr[i-1][j-1] + resultArr[i-1][j+1];
                resultArr[i][j] %= 1000000000;
            }
            resultArr[i][8] = resultArr[i-1][7]%1000000000;

        }

        int result = 0;
        for(int k : resultArr[inputNum]){
            result += k;
            result %= 1000000000;
        }

        System.out.println(result);
    }
}

// 결과를 10억으로 나눈 나머지
// %1000000000
