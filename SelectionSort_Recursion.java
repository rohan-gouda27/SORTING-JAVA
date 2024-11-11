package Sorting;

import java.util.Arrays;

public class SelectionSort_Recursion {
    static void selection(int[]arr,int minindex,int length){
        if(minindex>=length){
            return;
        }
        int min=minindex;
        for(int i=minindex+1;i<length;i++){
            if(arr[i]<arr[min]){
                min=i;
            }
        }
        int temp=arr[min];
        arr[min]=arr[minindex];
        arr[minindex]=temp;
        selection(arr,minindex+1,length);
    }
    public static void main(String[] args) {
        int[]arr={5,2,3,4,1};
        selection(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));

    }
}
