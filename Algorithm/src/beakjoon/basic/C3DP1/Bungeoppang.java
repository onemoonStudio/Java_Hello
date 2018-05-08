package beakjoon.basic.C3DP1;

import java.util.Scanner;

public class Bungeoppang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int howmanyBread = Integer.parseInt(sc.nextLine());




    }
}


// 붕어빵은 1000개 , 가격은 만원까지
// 첫번째 줄에 붕어빵의 갯수 , 두번째 줄에 가격 array 가 나온다.
// 1개를 팔았을때 n-1 를 팔때의 최대값
// 2개를 팔았을때 n-2 를 팔때의 최대값
// ...
// n-1개를 팔았을 때 1개를 팔때의 최대값
