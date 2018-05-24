package beakjoon.basic.C4Math1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class P11567_BaseConversion {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String nDecimal[] = br.readLine().split(" ");
        int aDecimal = Integer.parseInt(nDecimal[0]);
        int bDecimal = Integer.parseInt(nDecimal[1]);
        int howManyNum = Integer.parseInt(br.readLine());

        int decimalNum = 0;
        String inStr[] = br.readLine().split(" ");
        for(int i=0;i<howManyNum;i++)
            decimalNum += Integer.parseInt(inStr[howManyNum-1-i]) * Math.pow(aDecimal,i);

        Stack<Integer> stack = new Stack<>();

        while(decimalNum/bDecimal != 0){
            stack.push(decimalNum%bDecimal);
            decimalNum /= bDecimal;
        }
        if(decimalNum%bDecimal != 0 )
            stack.push(decimalNum);

        while(stack.size() != 0)
            System.out.print(stack.pop() +" ");

    }
}
