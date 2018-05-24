package beakjoon.basic.C5Sorting;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class P11004_KNumber {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        String input[] = br.readLine().split(" ");
        int howMany = Integer.parseInt(input[0]);
        int target = Integer.parseInt(input[1]);
        int arr[] = new int[howMany];

        String[] arrStr = br.readLine().split(" ");
        for(int i=0;i<howMany;i++){
            arr[i] = Integer.parseInt(arrStr[i]);
        }

        Arrays.sort(arr);
        writer.write(arr[target-1]);
        writer.flush();

    }

    public static int partition(int A[],int p,int r){
        int i=p-1,j=p-1;
        int temp;
        int pivot = A[r];

        while(j < r){
            if(A[j+1] < pivot){
                temp = A[++i];
                A[i] = A[++j];
                A[j] = temp;
            }else j++;

        }

        temp = A[++i];
        A[i] = A[r];
        A[r] = temp;

        return i;

    }

    public static void quickSort(int A[],int p,int r,int target ){
        if(p<r){
            int q = partition(A,p,r);

            quickSort(A,p,q-1,target);
            quickSort(A,q+1,r,target);
        }
    }

}

// quick selection
