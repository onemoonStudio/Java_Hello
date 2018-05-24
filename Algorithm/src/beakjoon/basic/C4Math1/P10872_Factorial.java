package beakjoon.basic.C4Math1;

import java.util.Scanner;

public class P10872_Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int result =1;
        for(int i=2;i<=number;i++)
            result *= i;

        System.out.println(result);
    }
}
