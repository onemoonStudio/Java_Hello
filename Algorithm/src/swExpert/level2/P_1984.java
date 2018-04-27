// 평균값 구하기
package swExpert.level2;

import java.util.Scanner;

public class P_1984 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int howmany = Integer.parseInt(sc.nextLine());
        for(int i=0;i<howmany;i++){
            String input = sc.nextLine();
            String cval[] = input.split(" ");
            int val[]= new int[10];
            int max =0;
            int min=0;
            double sum =0;
            for(int k=0;k<10;k++){
                val[k] = Integer.parseInt(cval[k]);
                if(val[max] < val[k]) max = k;
                if(val[min] > val[k]) min = k;
                sum += val[k];
            }
            sum = sum- val[min]-val[max];
            sum /= 8;
            sum = Math.round(sum);
            System.out.println("#"+i+1+" "+sum);

        }

    }
}

