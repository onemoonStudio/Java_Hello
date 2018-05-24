package beakjoon.basic.C4Math1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P6588_goldbachNumber {
    public static void main(String[] args) throws Exception{
        int primeArr[] = new int[1000000+1];
        primeArr[1] = 1;

        for (int i=2;i<=1000;i++){
            if(primeArr[i] != 1){
                for(int k=2*i;k<=1000000;k+=i)
                    primeArr[k] = 1;
            }
        }


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            int target = Integer.parseInt(br.readLine());
            if(target == 0) break;
            if(target %2 == 1){
                System.out.println("Goldbach's conjecture is wrong.");
            }else
                for(int i=2;i<target+1;i++){
                    if(primeArr[i] == 0 && primeArr[target-i] ==0) {
                        System.out.printf("%d = %d + %d \n", target, i, target - i);
                        break;
                    }
                    if(i == target+i) System.out.println("Goldbach's conjecture is wrong.");
                }

        }


    }
}
