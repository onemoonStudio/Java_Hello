package beakjoon.step.one_ten;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P4948_Bertrang {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputN;
        int primeArr[] = new int[250000];
        // 0 소수 or 확인 안한 것들
        // 1 소수 x

        primeArr[1] = 1;

        while((inputN = Integer.parseInt(br.readLine())) != 0){

            int subEnd = (int)Math.sqrt(2*inputN);

            for(int k=2;k<=subEnd;k++){
                if(primeArr[k] != 1){
                    for(int i=2*k;i<=inputN*2;i+=k)
                        primeArr[i] = 1;
                }
            }

            int count = 0;

            for(int i = inputN+1; i <= 2*inputN ; i++){
                if(primeArr[i] == 0) count++;
            }
            System.out.println(count);
        }
    }
}

// 방식은 맞지만 너무 느리다.
// 에라토스테네스의 체 알고리즘 사용

