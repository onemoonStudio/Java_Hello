package beakjoon.basic.C1InOutput;

import java.util.Scanner;

public class PrintTenChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mashString = sc.nextLine();

        int howManyLooping = (mashString.length()/10);
        for(int i=0;i<howManyLooping;i++ ){
            System.out.println(mashString.substring(
                    i*10 , (i+1)*10
            ));
        };

        System.out.println(mashString.substring(10*howManyLooping));

    }
}
