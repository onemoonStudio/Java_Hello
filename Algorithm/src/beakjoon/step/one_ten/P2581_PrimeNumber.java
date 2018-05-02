package beakjoon.step.one_ten;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P2581_PrimeNumber {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int start = Integer.parseInt(br.readLine());
        int end = Integer.parseInt(br.readLine());

        // version 2
        // 에라토스테네스의 체 사용
        int primeArr[] = new int[end+1];
        primeArr[1] = 1;

        int subEnd = (int)Math.sqrt(end);
        for(int i=2;i<=subEnd;i++){
            if(primeArr[i] != 1){
                for(int k=i*2;k<=end;k+=i) primeArr[k] = 1;
            }

        }

        int sum = 0;
        int min = 0;
        for(int i=start;i<=end;i++){
            if(primeArr[i] == 0 ) {
                sum+= i;
                if( min ==0 ) min = i;
            }
        }
        if(sum == 0){
            System.out.println("-1");
        }else{
            System.out.println(sum);
            System.out.println(min);
        }


        // version 1
//        int minMinority = 0;
//        int sum = 0;
//        for(int i = start ; i <= end ; i++){
//            if(i == 1) continue;
//            boolean minority = true;
//            for(int k=i/2; k>1; k--){
//                if (i%k == 0) {
//                    minority = false;
//                    break;
//                }
//            }
//
//            if(minority) {
//                if(minMinority == 0) minMinority = i;
//                sum += i;
//            }
//
//        }
//
//        if( minMinority == 0 ) {
//            System.out.println("-1");
//        }else{
//            System.out.println(sum);
//            System.out.println(minMinority);
//        }

    }
}

// 소수 찾기랑 동일
// 단 1일때를 확인 못해서 틀렸음
// 1은 소수가 아니다 !