package beakjoon.step.one_ten;

import java.util.Scanner;

public class Sangsoo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputSplit[] =sc.nextLine().split(" ");
        int first = Integer.parseInt(inputSplit[0]);
        int second = Integer.parseInt(inputSplit[1]);

        if(updown(first) > updown(second)){
            System.out.println(updown(first));
        }else{
            System.out.println(updown(second));
        }
    }
    public static int updown(int num){
        int t = num/100;
        int m = (num/10)%10;
        int b = num%10;

        return (b*100 + m*10 + t);
    }
}
