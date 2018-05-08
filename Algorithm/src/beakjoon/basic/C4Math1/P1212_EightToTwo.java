package beakjoon.basic.C4Math1;

import java.util.Scanner;
import java.util.Stack;

public class P1212_EightToTwo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        Stack<Character> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int len = str.length();
        for(int i=len-1;i>=0;i--){
            int temp = str.charAt(i)-'0';
            char tempCharArr[] = {'0','0','0'};
            if(temp/4 == 1) tempCharArr[0] = '1';
            if(temp ==2 || temp ==3 || temp == 6 || temp == 7) tempCharArr[1] = '1';
            if(temp%2 == 1 ) tempCharArr[2] = '1';

            if( i != 0){
                stack.push(tempCharArr[2]);
                stack.push(tempCharArr[1]);
                stack.push(tempCharArr[0]);
            }else{
                if(tempCharArr[0] == '0' && tempCharArr[1] =='0'){
                    stack.push(tempCharArr[2]);
                }else if (tempCharArr[0] == '0' ){
                    stack.push(tempCharArr[2]);
                    stack.push(tempCharArr[1]);
                }else{
                    stack.push(tempCharArr[2]);
                    stack.push(tempCharArr[1]);
                    stack.push(tempCharArr[0]);
                }
            }

        }

        while(true){
            if(stack.empty()) break;
            sb.append(stack.pop());
        }
        System.out.println(sb.toString());

    }
}

// 비트 스위치