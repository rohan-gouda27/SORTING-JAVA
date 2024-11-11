package Sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Selection_Sort {
    private void selection_sort(int[]arr){
        for(int i=0;i<arr.length-1;i++){
           int minindex=i;
           for(int j=i+1;j<arr.length;j++){
               if(arr[minindex]>arr[j]){
                   minindex=j;
               }
           }
           int temp=arr[minindex];
           arr[minindex]=arr[i];
           arr[i]=temp;
            }
        }


    public static void main(String[] args) {
    int[]arr={5,4,1,2,3};
        Selection_Sort so=new Selection_Sort();
        so.selection_sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
