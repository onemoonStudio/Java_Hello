package beakjoon.step.one_ten;

import java.util.Scanner;

public class KaingCalender {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int howMany = Integer.parseInt(sc.nextLine());

        for(int i=0;i<howMany;i++){
            String inputStr[] = sc.nextLine().split(" ");
            int result = 0;

            int m = Integer.parseInt(inputStr[0]);
            int n = Integer.parseInt(inputStr[1]);

            int x = Integer.parseInt(inputStr[2]);
            int y = Integer.parseInt(inputStr[3]);


            if(m >= n){
                // m이 기준이 된다.

                int temp = x;

                while (temp < m*n){

                    if(temp%n == y){
                        result = temp;
                        break;
                    }else if(temp%n == 0 && y == n){
                        result = temp;
                        break;
                    }

                    temp += m;
                }
            }else{
                int temp = y;

                while (temp < m*n){

                    if(temp%m == x){
                        result = temp;
                        break;
                    }else if(temp%m == 0 && x == m){
                        result = temp;
                        break;
                    }

                    temp += n;
                }
            }

            if(result == 0){
                System.out.println(-1);
            }else{
                System.out.println(result);
            }


        }
    }
}
