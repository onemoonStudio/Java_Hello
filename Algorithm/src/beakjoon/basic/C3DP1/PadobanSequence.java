package beakjoon.basic.C3DP1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PadobanSequence {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int howMany = Integer.parseInt(br.readLine());

        long result[] = new long[101];
        result[0] = 0;
        result[1] = 1;
        result[2] = 1;
        result[3] = 1;
        result[4] = 2;
        result[5] = 2;
        result[6] = 3;
        result[7] = 4;
        result[8] = 5;

        for(int s=0;s<howMany;s++){
            int input = Integer.parseInt(br.readLine());
            if( input >=9){
                for(int i=9;i<=input;i++){
                    result[i] = result[i-5] + result[i-1];
                }
            }
            System.out.println(result[input]);
        }
    }

}
