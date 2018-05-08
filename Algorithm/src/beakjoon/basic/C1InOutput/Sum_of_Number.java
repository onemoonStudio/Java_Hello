package beakjoon.basic.C1InOutput;

import java.util.Scanner;

public class Sum_of_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int how_many = Integer.parseInt(sc.nextLine());
        String line = sc.nextLine();
        // int sizeOfLine = line.length();

        int result = 0;
        for(int i=0;i<how_many;i++){
            result += (int)line.charAt(i)-48;
        }
        System.out.println(result);
    }
}
