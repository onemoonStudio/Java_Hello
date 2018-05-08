package beakjoon.basic.C3DP1;

import java.util.Scanner;

public class P1699_SquareNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int dpArr[] = new int[input + 1];
        dpArr[1] = 1;
        for (int i = 2; i <= input; i++) {
            int root = (int) Math.sqrt((double) i);
            for (int k = 1; k <= root; k++) {
                if (k == 1) {
                    dpArr[i] = dpArr[i - (int) Math.pow(k, 2)];
                } else {
                    dpArr[i] = Math.min(dpArr[i - (int) Math.pow(k, 2)], dpArr[i]);
                }
            }
            dpArr[i]++;
        }


        System.out.println(dpArr[input]);


    }
}

    // version 1
    // 반례 32 => 16 + 16 이지만 나의 답은 5가 나온다.
//    public static void main(String[] args) throws Exception{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        double inputNumber = Double.valueOf(br.readLine());
//        int result[] = new int[(int)inputNumber+1];
//
//        if((int)inputNumber <4){
//            System.out.println((int)inputNumber);
//        }else{
//            result[0] = 0;
//            result[1] = 1; result[2] = 2; result[3] = 3; result[4] = 1;
//            for(int i=5;i<(int)inputNumber+1;i++){
//                int tempNumber = i;
//                int tempSqrt = (int)Math.sqrt(tempNumber);
//                tempNumber -= tempSqrt*tempSqrt;
//                result[i] = result[tempNumber] + 1;
//            }
//            System.out.println(result[(int)inputNumber]);
//        }
//    }

