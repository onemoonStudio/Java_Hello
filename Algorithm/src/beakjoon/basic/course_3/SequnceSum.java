package beakjoon.basic.course_3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SequnceSum {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int seqLength = Integer.parseInt(br.readLine());
        String seqStr[] = br.readLine().split(" ");
        int seq[] = new int[seqLength];
        for (int k=0;k<seqLength;k++){
            seq[k] = Integer.valueOf(seqStr[k]);
        }

        int result[] = new int[seqLength];
        result[0] = seq[0];

        int TemporaryMax = result[0];

        for (int i = 1; i<seqLength ;i++) {

            if(TemporaryMax < 0 && seq[i] < 0 ){
                result[i] = findMax(seq[i], TemporaryMax);
                TemporaryMax = result[i];
            }else if(TemporaryMax <= 0 && seq[i] >= 0 ){
                result[i] = seq[i];
                TemporaryMax  = seq[i];
            }
            else if(TemporaryMax >= 0 && TemporaryMax + seq[i] <= 0){
                TemporaryMax = 0;
                result[i] = result[i-1];
            }else{
                TemporaryMax += seq[i];
                result[i] = findMax(TemporaryMax,result[i-1]);
            }
            System.out.print(seq[i] + " " + TemporaryMax + " "+result[i] + '\n' );
        }

        System.out.println(result[seqLength-1]);
    }

    public static int findMax(int a, int b){
        if(a>=b){
            return a;
        }else{
            return b;
        }
    }
}
