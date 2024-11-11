package Sorting;

import java.util.Arrays;

public class Bubble_Sort {
    private static void bubble(int[]arr) {
boolean swapped;
        for(int i=0;i<arr.length;i++){
            swapped=false;
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }
            }
            if(!swapped){
                break;
            }
        }

    }
    public static void main(String[] args) {
     int[]arr={5,4,1,3,2};
     int []a={1,2,3,4,5};
     bubble(arr);
        bubble(a);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
}
}
