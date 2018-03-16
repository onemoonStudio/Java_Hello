package beakjoon.basic.course_1;

import java.util.Scanner;

public class A_Plus_B_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int i_1 , i_2;
            i_1 = sc.nextInt();
            i_2 = sc.nextInt();
            if(i_1==0 && i_2==0) break;
            System.out.println(i_1 + i_2);
        }
    }
}
