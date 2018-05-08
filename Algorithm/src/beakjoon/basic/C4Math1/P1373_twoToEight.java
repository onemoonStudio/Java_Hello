package beakjoon.basic.C4Math1;

import java.util.Scanner;

public class P1373_twoToEight {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int len = input.length();

        int temp = 0;
        int count = 0;

        for(int i=len-1;i>=0;i--){
            count ++;
            if(input.charAt(i) == '1') temp += (int)Math.pow(2,(count+2)%3);

            if(count%3 ==0){
                sb.insert(0,temp);
                temp = 0;
            }
            if(count %3 != 0 && i == 0){
                sb.insert(0,temp);
            }
        }

        System.out.println(sb.toString());
    }
}
