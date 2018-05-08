package beakjoon.basic.C3DP1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MaxUpSequence {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(br.readLine());
        String inputStr[] = br.readLine().split(" ");
        int sequnece[] = new int[length];
        for(int p=0;p<length;p++){
            sequnece[p] = Integer.parseInt(inputStr[p]);
        }
        // Sequnece 완성
        int sumArr[] = new int[length];
        sumArr[0] = sequnece[0];
        int resultMax = sequnece[0];

        if(length != 1){

            int TempMax;
            for(int i=1;i<length;i++){
                TempMax = 0;
                for(int k=0;k<i;k++){
                    if(sequnece[i] > sequnece[k] && TempMax <= sumArr[k]){
                        TempMax = sumArr[k];
                    }
                }
                sumArr[i] = TempMax + sequnece[i];
                if(resultMax <= sumArr[i] ) resultMax= sumArr[i];
            }

        }


        System.out.println(resultMax);

    }
}