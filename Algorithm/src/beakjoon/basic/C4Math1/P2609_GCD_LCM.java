package beakjoon.basic.C4Math1;

import java.util.Scanner;

public class P2609_GCD_LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int GCD = 1;
        int LCM = 1;

        while(a >1 && b>1){
            boolean flag_out = true;
            for(int i=2; i <= Math.min(a,b);i++){
                if(a%i == 0 && b%i ==0){
                    flag_out = false;
                    GCD *= i;
                    a /= i;
                    b /= i;
                    break;
                }
            }
            if (flag_out) break;

        }
        LCM = GCD;
        while(a>1){
            for(int i=2;i<=a;i++){
                if(a%i == 0) {
                    LCM *= i;
                    a/=i;
                }
            }
        }

        while(b>1){
            for(int i=2;i<=b;i++){
                if(b%i ==0) {
                    LCM *= i;
                    b/=i;
                }
            }
        }


        System.out.println(GCD);
        System.out.println(LCM);

    }
}

// 2 3
// 2 5
