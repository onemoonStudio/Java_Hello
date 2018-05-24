package beakjoon.basic.C5Sorting;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P11650_sortingCor {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int howMany = Integer.parseInt(br.readLine());
        int coordinate[][] = new int[howMany][2];
        for(int i=0;i<howMany;i++){
            String input = br.readLine();
            coordinate[i][0] = Integer.parseInt(input.split(" ")[0]);
            coordinate[i][1] = Integer.parseInt(input.split(" ")[1]);
        }

        quickSort(coordinate,0,howMany-1,0);
        int sub_st=0 , sub_end=0;

        for(int i=0;i<howMany;i++){
            if(coordinate[i][0] != coordinate[sub_st][0] ){
                sub_end = i-1;
                if(sub_end-sub_st > 0){
                    quickSort(coordinate,sub_st,sub_end,1);
                }
                sub_st = i; sub_end = i;
            }
            else if(i == howMany-1 && i-sub_st > 0){
                quickSort(coordinate,sub_st,i,1);
            }

        }



        for(int i=0;i<howMany;i++){
            writer.write(coordinate[i][0] +" " + coordinate[i][1]);
            if(i!=howMany-1) writer.newLine();
        }
        writer.flush();

    }

    public static int partition(int A[][],int p,int r,int target){
        int i=p-1,j=p-1;
        int temp;
        int sub_target = target == 0 ? 1:0;
        int pivot = A[r][target];

        while(j < r){
            if(A[j+1][target] < pivot){
                temp = A[++i][target];
                A[i][target] = A[++j][target];
                A[j][target] = temp;

                temp = A[i][sub_target];
                A[i][sub_target] = A[j][sub_target];
                A[j][sub_target] = temp;
            }else j++;

        }

        temp = A[++i][target];
        A[i][target] = A[r][target];
        A[r][target] = temp;

        temp = A[i][sub_target];
        A[i][sub_target] = A[j][sub_target];
        A[j][sub_target] = temp;

        return i;

    }

    public static void quickSort(int A[][],int p,int r,int target){
        if(p<r){
            int q = partition(A,p,r,target);
            quickSort(A,p,q-1,target);
            quickSort(A,q+1,r,target);
        }
    }
}
