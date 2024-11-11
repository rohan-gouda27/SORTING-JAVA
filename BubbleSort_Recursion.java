package Sorting;

import java.util.Arrays;

public class BubbleSort_Recursion {
    static void bubble(int[]arr,int lastindex,int index){
        if(lastindex==0){
            return;
        }
        if( lastindex>index){
        if(arr[index] >arr[index+1]) {
            int temp = arr[index];
            arr[index] = arr[index + 1];
            arr[index + 1] = temp;
        }
            bubble(arr,lastindex,index+1);
        }else {
            bubble(arr,lastindex-1,0);
        }
    }

    public static void main(String[] args) {
        int[]arr={4,3,2,1};
        bubble(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }
}
