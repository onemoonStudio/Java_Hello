package beakjoon.basic.C3DP1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P11054_Bitonic {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(br.readLine());
        String inputSeq[] = br.readLine().split(" ");
        int sequence[] = new int[length];
        for(int i=0;i<length;i++) sequence[i] = Integer.parseInt(inputSeq[i]);
        int result[] = new int[length];
        int subResult[] = new int[length];

        for(int i=0;i<length;i++){
            result[i] = 1;
            int max = 0;
            for(int k=0;k<i;k++){
                if(sequence[k] < sequence[i]){
                    if( max == 0 ) max = result[k];
                    else if( max < result[k]) max = result[k];
                }
            }
            result[i] = max+1;
        }

        for(int i=length-1;i>=0;i--){
            subResult[i] = 1;
            int max = 0;
            for(int k=i;k<length;k++){
                if(sequence[i] > sequence[k]){
                    if(max ==0) max = subResult[k];
                    else if (max < subResult[k]) max = subResult[k];
                }
            }
            subResult[i] = max +1;
        }


        for(int i=0;i<length;i++){
            int max = 0;
            for(int k=i;k<length;k++){
                if(sequence[i] > sequence[k] ){
                    if(max == 0) max = subResult[k];
                    else if(max < subResult[k]) max = subResult[k];
                }
            }
            result[i] += max;
        }

        int resultMax = 0;
        for(int el : result){
            if(el > resultMax) resultMax = el;
        }

        System.out.println(resultMax);

    }
}

// 시간복잡도는 n 제곱
// 긴 증가 수열 계산과
// 긴 감소 수열 계산을 한 뒤
// 각 증가 수열이 최대라고 가정하고 다음 인덱스부터 감소하는 최대를 구해서 더한다.

//        10
//        1 5 2 1 4 3 4 5 2 1

//        1 2 2 1 3 3 4 5 2 1  - result
//        1 5 2 1 4 3 3 3 2 1  - subResult
//        1 6 3 1 6 5 6 7 3 1  - 합쳐진 result

//        7 - 최대