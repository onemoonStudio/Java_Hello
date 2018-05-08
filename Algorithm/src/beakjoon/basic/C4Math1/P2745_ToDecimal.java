package beakjoon.basic.C4Math1;

import java.util.Scanner;

public class P2745_ToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputStr[] = sc.nextLine().split(" ");
        String inputNum = inputStr[0];
        int cimal = Integer.parseInt(inputStr[1]);
        int len = inputNum.length();
        int result = 0;
        int mul =1;

        for(int i=len-1;i>=0;i--){

            int tempNum =0;
            int tempChar = inputNum.charAt(i);
            if( '0'<=tempChar && tempChar<='9'){
                tempNum = (int)(tempChar - '0');
            }else{
                tempNum = (int)(tempChar-'A')+10;
            }

            result += tempNum*mul;
            mul *= cimal;
        }
        System.out.println(result);
    }
}
