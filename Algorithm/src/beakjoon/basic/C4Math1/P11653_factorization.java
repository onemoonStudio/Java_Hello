package beakjoon.basic.C4Math1;

import java.util.Scanner;

public class P11653_factorization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        while(number > 1){

            for(int i=2;i<=number;i++)
                if(number%i == 0){
                    System.out.println(i);
                    number /= i;
                    break;
                }
        }
    }
}
