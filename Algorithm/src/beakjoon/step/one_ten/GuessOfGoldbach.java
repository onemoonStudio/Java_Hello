package beakjoon.step.one_ten;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GuessOfGoldbach {
    public static void main(String[] args) throws Exception{
        int primeArr[] = new int[10000+1];
        primeArr[1] = 1;
        for (int i=2;i<=100;i++){
            if(primeArr[i] != 1){
                for(int k=2*i;k<=10000;k+=i)
                    primeArr[k] = 1;
            }
        }


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int howMany = Integer.parseInt(br.readLine());
        for(int k=0;k<howMany;k++){
            int input = Integer.parseInt(br.readLine());
            int mid = input/2;

            for(int p=mid;p<input;p++){
                if(primeArr[p] == 0 && primeArr[input-p] == 0)
                {
                    System.out.print(input-p+" ");
                    System.out.print(p+"\n");
                    break;
                }
            }

        }
    }
}
