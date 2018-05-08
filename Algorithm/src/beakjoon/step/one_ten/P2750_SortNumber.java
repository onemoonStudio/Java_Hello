package beakjoon.step.one_ten;

import java.io.BufferedReader;
import java.io.InputStreamReader;
//import java.util.ArrayList;

public class P2750_SortNumber {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int howMany = Integer.parseInt(br.readLine());
        //ArrayList<Integer> arr = new ArrayList<>();
        int arr[] = new int[howMany];
        for(int i=0;i<howMany;i++){
            arr[i] = Integer.parseInt(br.readLine());

            if(i != 0){
                int key = arr[i];

                for(int k=i;k>0;k--){
                    if(arr[k-1] > key){
                        int temp = arr[k];
                        arr[k] = arr[k-1];
                        arr[k-1] = temp;
                        // arr[k] = arr[k-1];
                        // 아래처럼 하면 안된다.
                    }else{
                        arr[k] = key;
                        break;
                    }
                }
            }
        }

        for(int el : arr){
            System.out.println(el);
        }

    }

}
