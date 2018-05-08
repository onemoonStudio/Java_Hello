package beakjoon.basic.C3DP1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1912_SequnceSum {

    // DP 로 풀어보자
    // 나의 풀이와 동일하지만 표현의 차이이다.
    // starting porint 를 변화시키는 것이 핵심
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        int n = Integer.parseInt(br.readLine());
        int dp[] = new int[n+1];
        int a[] = new int[n+1];
        st = new StringTokenizer(br.readLine());
        for(int i=1;i<=n;i++) a[i] = Integer.parseInt(st.nextToken());

        int ans = a[1];
        for(int i=1;i<=n;i++){
            dp[i] = Math.max(dp[i-1]+a[i] , a[i]);
            ans = Math.max(dp[i] , ans);
        }

        System.out.println(ans);
    }



}


// 나의 풀이는 dp 가 아닌 전체를 탐색하는 방식
// 각 인덱스가 시작이라고 가정했을 때 푼다. 그 중에서 최대값을 구한다.

//public static void main(String[] args) throws Exception {
//    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//    int seqLength = Integer.parseInt(br.readLine());
//    String seqStr[] = br.readLine().split(" ");
//    int seq[] = new int[seqLength];
//    for (int k = 0; k < seqLength; k++) {
//        seq[k] = Integer.valueOf(seqStr[k]);
//    }
//    long result = 0;
//    long tempMax , tempSum;
//
//    for(int i=0;i<seqLength;i++){
//        tempMax = seq[i];
//        tempSum = seq[i];
//
//        for(int k=i+1;k<seqLength;k++){
//            tempSum+= seq[k];
//            if(tempMax < tempSum) tempMax = tempSum;
//
//        }
//        if(i == 0 ) result = tempMax;
//        else if(tempMax > result ) result = tempMax;
//
//    }
//    System.out.println(result);
//}