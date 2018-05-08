package beakjoon.basic.C3DP1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P11722_LongestDownSequence {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(br.readLine());
        String inputStr[] = br.readLine().split(" ");
        int sequnece[] = new int[length];
        for(int p=0;p<length;p++){
            sequnece[p] = Integer.parseInt(inputStr[p]);
        }
        // sequnence End

        int result[] = new int[length];
        result[0] = 1;
        int resultMax = 1;

        for(int i=1;i<length;i++){
            int max = result[i];
            for(int k=0;k<i;k++){
                if(sequnece[k] > sequnece[i] && result[k] > max){
                    max = result[k];
                }
            }
            result[i] = max+1;
            resultMax = Math.max(resultMax,result[i]);
        }

//        for(int el : result){
//            System.out.print(el+" ");
//        }
//        System.out.println(" ");
        System.out.println(resultMax);

    }
}
