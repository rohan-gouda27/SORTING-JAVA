package Sorting;

import java.util.Arrays;

public class Cyclic_Sort {
    private static void cyclic(int[]arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }
    }
    private static void swap(int[]arr,int first,int last){
        int temp=arr[first];
        arr[first]=arr[last];
        arr[last]=temp;
    }
    public static void main(String[] args) {
        int[]arr={1,5,4,3,2};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }
}
