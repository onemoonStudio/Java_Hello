package beakjoon.step.one_ten;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P1929_findPrimeNum {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input  = br.readLine();
        int start = Integer.parseInt(input.split(" ")[0]);
        int end = Integer.parseInt(input.split(" ")[1]);

        int primeArr[] = new int[end+1];
        // 소수가 아니면 1
        primeArr[1] = 1;
        int subEnd = (int)Math.sqrt(end);
        for(int i=2;i<=subEnd;i++){
            if(primeArr[i] != 1 )
                for(int k=i*2;k<=end;k+=i)
                    primeArr[k] = 1;


        }

        for(int i=start;i<=end;i++){
            if(primeArr[i] != 1)
                System.out.println(i);

        }

    }
}

// 에라토스테네스 문제
// 에라토스테네스의 체로 안풀면 시간초과가 나서 실패함
