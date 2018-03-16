package beakjoon.basic.course_1;

import java.util.Scanner;
import java.util.StringTokenizer;

public class A_Plus_B_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int how_many = Integer.parseInt(sc.nextLine());

        for(int k=0;k<how_many;k++){
            StringTokenizer tokens = new StringTokenizer(sc.nextLine() , ",");
            System.out.println(Integer.parseInt(tokens.nextToken()) + Integer.parseInt(tokens.nextToken()));
        }
    }
}
