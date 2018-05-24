package beakjoon.classification.Graph;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P2262_Tournament {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int howMany = Integer.parseInt(br.readLine());
        String input[] = br.readLine().split(" ");
        int arr[] = new int[howMany];
        for(int i=0;i<howMany;i++)
            arr[i] = Integer.parseInt(input[i]);

        int test[][] = new int[howMany][howMany];
        int min = winner(0,1,arr);

        for(int i=0;i<howMany-1;i++)
            for(int j=i+1;j<howMany;j++){
                test[i][j] = winner(i,j,arr);
                min = Math.min(min,test[i][j]);
//                min = Math.min(min,winner(i,j,arr));
            }


        for(int i=0;i<howMany;i++){
            for(int j=0;j<howMany;j++){
                System.out.print(test[i][j]+" ");
            }
            System.out.println();
        }


        System.out.println("result is => "+min);

    }

    // idx1 < idx2
    public static int winner(int idx1,int idx2,int arr[]){
        if(arr.length == 2) return Math.abs(arr[0] - arr[1]);

        int length = arr.length;
        int sub_arr1[] = new int[idx2];
        int sub_arr2[] = new int[length-idx2];
        System.arraycopy(arr,0,sub_arr1,0,idx2);
        System.arraycopy(arr,idx2,sub_arr2,0,length-idx2);

        int result1 = 256;
        int result2 = 256;
        boolean flag = true;
        if(sub_arr1.length == 1 ) result1 = sub_arr1[0];
        else{
            for(int i=0;i<sub_arr1.length-1;i++)
                for(int j=i+1;j<sub_arr1.length;j++){
                    result1 = flag ? winner(i,j,sub_arr1) : Math.min(result1,winner(i,j,sub_arr1));
                    flag = false;
                }
        }

        flag = true;

        if(sub_arr2.length == 1 ) result2 = sub_arr2[0];
        else{
            for(int i=0;i<sub_arr2.length-1;i++)
                for(int j=i+1;j<sub_arr2.length;j++){
                    result2 = flag ? winner(i,j,sub_arr2) : Math.min(result2,winner(i,j,sub_arr2));
                    flag = false;
                }
        }

        return result1+result2;
    }
}
