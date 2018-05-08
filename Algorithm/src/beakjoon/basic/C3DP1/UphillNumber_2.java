package beakjoon.basic.C3DP1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;


public class UphillNumber_2 {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int inputNum = Integer.parseInt(br.readLine());
        int result=0;
        int[][] resultArr = new int[1002][10];
        Arrays.fill(resultArr[1],1);

        for(int k = 1; k < inputNum+1 ;k++){
            resultArr[k+1][0] = 1;
            for(int o=1;o<10;o++){
                resultArr[k+1][o] = resultArr[k][o] +resultArr[k+1][o-1];
            }
        }

        for(int sub : resultArr[inputNum]){
            result += sub;
        }
        System.out.println(result);

    }
}
