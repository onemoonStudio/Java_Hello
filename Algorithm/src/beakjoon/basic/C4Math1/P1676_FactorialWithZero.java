package beakjoon.basic.C4Math1;

import java.util.Scanner;

public class P1676_FactorialWithZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int result[][] = new int[number+1][3];


        for(int i=1;i<=number;i++){
            int temp = i;
            while(temp>=2 && temp%2 == 0){
                result[i][0]++;
                temp /= 2;
            }
            result[i][0] += result[i-1][0];

            while(temp>=5 && temp%5 == 0){
                result[i][1] ++;
                temp /= 5;
            }
            result[i][1] += result[i-1][1];

            result[i][2] = Math.min(result[i][0],result[i][1]);

        }

        System.out.println(result[number][2]);
    }
}
