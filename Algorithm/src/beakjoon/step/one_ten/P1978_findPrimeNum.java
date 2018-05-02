package beakjoon.step.one_ten;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P1978_findPrimeNum {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(br.readLine());
        String inputStr[] = br.readLine().split(" ");
        int inputArr[] = new int[length];
        for(int i=0;i<length;i++){
            inputArr[i] = Integer.parseInt(inputStr[i]);
        }
        //
        int result = 0;
        for(int el : inputArr){
            boolean minority = true;
            if(el == 1) {minority = false;}
            else
                for(int k=el/2;k>1;k--)
                    if(el%k == 0) {minority = false;}


            if(minority) result ++;

        }

        System.out.println(result);
    }
}
