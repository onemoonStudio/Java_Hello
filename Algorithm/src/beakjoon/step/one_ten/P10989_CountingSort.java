package beakjoon.step.one_ten;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P10989_CountingSort {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int howMany = Integer.parseInt(br.readLine());
        int inputArr[] = new int[howMany];
        int resultArr[] = new int[howMany];
        int max = 0;
        // 1~ 10000 까지의 숫자가 들어온다.
        for(int i=0;i<howMany;i++) {

            inputArr[i] = Integer.parseInt(br.readLine());
            if(inputArr[i] >= max) max = inputArr[i];
        }
        int countingArr[] = new int[max+1];
        counting(inputArr,countingArr);
        countingSort(inputArr,countingArr,resultArr);
        for(int el : resultArr)
            writer.write(el+"\n");

        writer.flush();
    }

    public static void counting(int arr[],int counting[]){
        for(int i=0;i<arr.length;i++){
            counting[arr[i]]++;
        }
        for(int k=0;k<counting.length-1;k++){
            counting[k+1] += counting[k];
        }
    }

    public static void countingSort(int arr[],int counting[],int result[]){
        for(int i=0;i<arr.length;i++){
            result[counting[arr[i]]-1] = arr[i];
            counting[arr[i]]--;
        }
    }

}
