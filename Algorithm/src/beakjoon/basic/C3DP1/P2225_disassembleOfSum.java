package beakjoon.basic.C3DP1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P2225_disassembleOfSum {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int arr[][] = new int[201][201];
        String input[] = br.readLine().split(" ");
        int number = Integer.parseInt(input[0]);
        int how = Integer.parseInt(input[1]);


        for(int i=1;i<= 200;i++){
            arr[i][2] = i+1;
            arr[i][1] = 1;
            arr[0][i] = 1;
        }


        if(how == 3){
            for(int i=0;i<=number;i++){
                arr[number][how] += arr[i][how-1];
                arr[number][how] %= 1000000000;
            }
        }else if(how >3) {
            for (int i = 1; i <= number; i++)
                for (int j = 3; j < how; j++)
                    for (int k = 0; k <= i; k++) {
                        arr[i][j] += arr[k][j - 1];
                        arr[i][j] %= 1000000000;
                    }
            for (int i = 0; i <= number; i++) {
                arr[number][how] += arr[i][how - 1];
                arr[number][how] %= 1000000000;
            }
        }

        System.out.println(arr[number][how]);

    }
}
