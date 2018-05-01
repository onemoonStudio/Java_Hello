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
        int stepStairMax[] = new int[howmanyStair+1];
        int nostepStairMax[] = new int[howmanyStair+1];
        stepStairMax[1] = stair[1];
        stepStairMax[2] = stair[1] + stair[2];
        stepStairMax[3] = Math.max(stair[1] + stair[3] , stair[2]+stair[3]);

        nostepStairMax[1] = 0;
        nostepStairMax[2] = stair[1];
        nostepStairMax[3] = stepStairMax[2];

        for(int k=4;k<howmanyStair+1;k++){
            stepStairMax[k] = stair[k] + findMax(nostepStairMax[k-2]+stair[k-1] , stepStairMax[k-2]);
            nostepStairMax[k] = stair[k-1] + findMax(stair[k-2] + nostepStairMax[k-3] , nostepStairMax[k-2]);
        }
        System.out.println(stepStairMax[howmanyStair]);


    }

    public static int findMax(int a,int b ){
        if(a>=b) return a;
        else return b;
    }
}
