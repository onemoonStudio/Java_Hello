package Sorting;

public class QuickSort {
    // quick sort algorithm
    // average case => O(nlgn) , worst case => O(n^2) ( 피봇 값이 최악의 경우로 잡힐 때 )
    public static void main(String[] args) {
        int[] test = {29,5,19,30,1,50,125,87,2};
        quickSort(test,0,test.length-1);
        for(int el : test){
            System.out.print(el + " ");
        }
    }

    public static int partition(int[] arr , int left , int right){

        int pivot = arr[(left+right)/2];
        while (left<right){
            while(arr[left] < pivot && left < right) left++;
            while(arr[right] > pivot && left < right) right--;

            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }

        }
        return left;
    }

    public static void quickSort(int[] arr,int left,int right){
        if(left<right){
            int newPivot = partition(arr,left,right);
            quickSort(arr,left,newPivot-1);
            quickSort(arr,newPivot+1,right);
        }

    }
}
