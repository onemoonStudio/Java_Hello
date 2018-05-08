package beakjoon.basic.C3DP1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// a(n) 이 음수나 0인경우 => M[n-1]
// a(n) 양수인경우
//  => M[n-1] == M[n-2] + a(n-1) 이면 M[n] = M[n-1] + a(n)
//  => 아닌경우에는 a(n)과 M[n-1]비교 후 M[n] 할당
public class ContinuingSum {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sequenceLength = Integer.parseInt(br.readLine());
        String inputStr[] = br.readLine().split(" ");
        int sequence[] = new int[sequenceLength];
        int maxList[] = new int[sequenceLength];

        for( int i=0;i<sequenceLength;i++){
            sequence[i] = Integer.valueOf(inputStr[i]);
        }

        maxList[0] = sequence[0];
        maxList[1] = findMax(sequence[0],sequence[1] , sequence[0]+sequence[1]);
        for(int k=2;k<sequenceLength;k++){
            if(sequence[k] <= 0 ){
                // 음수이거나 0일때
                maxList[k] = maxList[k-1];
            }else{
                // 양수일때
                if(maxList[k-1] == maxList[k-2]+sequence[k-1]){
                    maxList[k] = maxList[k-1] + sequence[k];
                }else{
                    maxList[k] = findMax(maxList[k-1],sequence[k]);
                }
            }
        }

        for(int k:maxList){
            System.out.print( k + " ");
        }
        System.out.println(" ");
        System.out.println(maxList[sequenceLength-1]);
    }

    public static int findMax(int a, int b){
        if(a>=b){
            return a;
        }else
            return b;
    }

    public static int findMax(int a , int b, int c){
        if(a>=b && a>=c){
            return a;
        }else if(b>=a && b>=c){
            return b;
        }else{
            return c;
        }
    }
}
