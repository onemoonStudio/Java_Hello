package beakjoon.basic.course_3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StairNumber {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int howmanyStair = Integer.parseInt(br.readLine());
        int stair[] = new int[howmanyStair+1];
        for(int i=0;i<howmanyStair;i++){
            stair[i+1] = Integer.parseInt(br.readLine());
        }
        // 계단 완성
        int stepStair[] = new int[howmanyStair+1];
        int nostepStair[] = new int[howmanyStair+1];
        stepStair[1] = stair[1];
        stepStair[2] = stair[1] + stair[2];
        stepStair[3] = findMax(stair[1] + stair[3] , stair[2]+stair[3] ,0);

        nostepStair[1] = 0;
        nostepStair[2] = stair[1];
        nostepStair[3] = stepStair[2];

        for(int k=4;k<howmanyStair+1;k++){
            int temp  = findMax(
                    stair[k-1]+nostepStair[k-3],
                    stair[k-1] + stepStair[k-3],
                    stair[k-2]+stepStair[k-3]
            );
            temp = findMax(
                    temp,
                    stair[k-2] + nostepStair[k-3],
                    0
                    );
            stepStair[k] = stair[k] + temp;
            nostepStair[k] = findMax(
                    stair[k-1] + stair[k-2] + nostepStair[k-3],
                    stair[k-1] + stepStair[k-3],
                    stair[k-2] + stepStair[k-3]
            );
        }
        System.out.println(stepStair[howmanyStair]);



    }

    public static int findMax(int a,int b , int c){
        if(a >= b && a>=c){
            return a;
        }else if(a<= b && b>=c)
            return b;
        else return c;
    }
}
