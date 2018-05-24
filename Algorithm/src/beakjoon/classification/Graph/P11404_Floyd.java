package beakjoon.classification.Graph;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P11404_Floyd {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // vertex number
        int cities = Integer.parseInt(br.readLine());
        // edge number
        int buses = Integer.parseInt(br.readLine());

        int moveCity[][] = new int[cities][cities];
        int result[][] = new int[cities][cities];

        for(int i=0;i<cities;i++)
            for(int j=0;j<cities;j++)
                if(i != j) moveCity[i][j] = 500000;

        for(int i=0; i<buses;i++){
            String temp[] = br.readLine().split(" ");
            if(moveCity[Integer.parseInt(temp[0])-1][Integer.parseInt(temp[1])-1] != 500000)
                Math.min( moveCity[Integer.parseInt(temp[0])-1][Integer.parseInt(temp[1])-1] , Integer.parseInt(temp[2]) );
            else
                moveCity[Integer.parseInt(temp[0])-1][Integer.parseInt(temp[1])-1] = Integer.parseInt(temp[2]);
        }


        for(int r=0;r<cities;r++) {
            for (int i = 0; i < cities; i++) {
                for (int j = 0; j < cities; j++) {
                    if(i != j)
                        if( r == 0 ) result[i][j] = Math.min( moveCity[i][j] , moveCity[i][r] + moveCity[r][j]);
                        else result[i][j] = Math.min( result[i][j] , result[i][r] + result[r][j]);
                }
            }
        }


        for(int i=0;i<cities;i++){
            for(int k=0;k<cities;k++){
                if( result[i][k] >= 500000 ) System.out.print(0+" ");
                else System.out.print(result[i][k] +" ");
            }
            System.out.println();
        }


    }
}
