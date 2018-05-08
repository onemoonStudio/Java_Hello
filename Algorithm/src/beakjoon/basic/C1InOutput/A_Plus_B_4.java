package beakjoon.basic.C1InOutput;

import java.util.Scanner;

public class A_Plus_B_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            // 기본적으로 체점할 때 무한루프 x
            int i_1 , i_2;
            i_1 = sc.nextInt();
            i_2 = sc.nextInt();

            System.out.println(i_1 + i_2);
        }
    }
}
