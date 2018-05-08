package beakjoon.basic.C1InOutput;

import java.util.Scanner;

public class Print_itactly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNextLine()){
            String line = sc.nextLine();
            if(line.isEmpty()){
                // Print_intactly_2 에서는 if문을 제거하면 된다.
                break;
            }

            System.out.println(line);
        }

    }
}
