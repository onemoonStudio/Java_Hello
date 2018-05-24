package beakjoon.basic.C5Sorting;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P1377_BubbleSort {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int howMany = Integer.parseInt(br.readLine());
        int arr[] = new int[howMany];
        for(int i=0;i<howMany;i++)
            arr[i] = Integer.parseInt(br.readLine());

        int result=1;
        int max = 0;
        int temp=0;
        boolean compare = false;

        for(int i=howMany-1;i>0;i--){
            if(arr[i-1] > arr[i] && !compare){
                compare = true;
                temp = arr[i];
                result ++;
            }else if (arr[i-1] > temp && compare){
                result ++;
            }else if (arr[i-1] <= temp && compare){
                compare = false;
                max = Math.max(max,result);
                result = 0;
            }



        }

        System.out.println(max+1);
    }
}
