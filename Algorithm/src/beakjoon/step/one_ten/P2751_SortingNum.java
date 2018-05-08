package beakjoon.step.one_ten;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P2751_SortingNum {
    // mere sort 혹은 heap sort 를 이용해야 한다.
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int howMany = Integer.parseInt(br.readLine());
        int arr[] = new int[howMany];
        for(int i=0;i<howMany;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }


        //mergesort(0,howMany-1,arr);
        heapSort(arr.length-1,arr);

        for(int el:arr){
            System.out.println( el );
        }
    }

    // merge Sort - 안된다....
    public static void merge(int s,int m,int e, int arr[]){
        int t = 0;
        int i = s;
        int j = m+1;
        int temp[] = new int[arr.length];
        while(i <= m && j <= e){
            if(arr[i] > arr[j]) temp[t++] = arr[j++];
            else temp[t++] = arr[i++];
        }
        while(i <= m) temp[t++] = arr[i++];
        while(j <= e) temp[t++] = arr[j++];

        i = s;
        t = 0;
        while(i<=e) arr[i++] = temp[t++];
    }

    public static void mergesort(int s,int e,int arr[]){

        if(s<e){
            int m = (s+e)/2;
            mergesort(s,m,arr);
            mergesort(m+1,e,arr);
            merge(s,m,e,arr);
        }

    }

    // heapSort
    public static void heapify(int n,int k ,int arr[]){
        int left = 2*k+1;
        int right = 2*k+2;
        int bigger;

        if(right <= n){
            if(arr[left] > arr[right]){bigger = left;}
            else bigger = right;
        }else if(left <= n){
            bigger = left;
        }else{return;}

        if(arr[bigger] > arr[k]){
            int temp = arr[k];
            arr[k] = arr[bigger];
            arr[bigger] = temp;
        }

        heapify(n,bigger,arr);

    }
    public static void buildHeap(int n,int arr[]){
        for(int i=n/2;i>=0;i--)
            heapify(n,i,arr);
    }
    public static void heapSort(int n ,int arr[]){
        buildHeap(n,arr);

        for(int i=n;i>0;i--){

            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;
            heapify(i-1,0,arr);
        }
    }


}
