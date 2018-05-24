package beakjoon.basic.C4Math1;

import java.util.Scanner;

public class P2004_Combination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if(n == m || m ==0 || n ==0){
            System.out.println(0);
        }else{
            m = Math.min(m,n-m);
            long top_two=0;
            long top_five=0;
            long bottom_two=0;
            long bottom_five=0;

            for(int i=0;i<m;i++){
                int temp = n-i;

                while(temp >= 2 && temp%2 ==0){
                    top_two++;
                    temp /= 2;
                }
                while(temp >= 5 && temp%5 ==0){
                    top_five++;
                    temp /= 5;
                }

            }

            for(int i=0;i<m;i++){
                int temp = i+1;
                while(temp >= 2 && temp%2 ==0){
                    bottom_two++;
                    temp /= 2;
                }
                while(temp >= 5 && temp%5 ==0){
                    bottom_five++;
                    temp /= 5;
                }
            }
            long result = Math.min( top_two - bottom_two , top_five - bottom_five );

            if (result <= 0) System.out.println(0); else System.out.println(result);
        }

    }
}
