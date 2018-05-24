package beakjoon.basic.C5Sorting;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class P11652_Card {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int howMany = Integer.parseInt(br.readLine());
        Long arr[] = new Long[howMany];

        for(int i=0;i<howMany;i++){
            arr[i] = Long.valueOf(br.readLine());
        }


        Arrays.sort(arr);

        long result = arr[0];
        int max = 0;
        int tempMax = 1;
        long temp = arr[0];

        for(int i=1;i<howMany;i++){

            if(temp == arr[i]) {
                tempMax++;

                if(max < tempMax){
                    result = arr[i-1];
                    max = tempMax;
                }
            }
            else{
                tempMax = 1;
                temp = arr[i];
            }


        }

        writer.write(String.valueOf(result));
        writer.flush();
    }
}
