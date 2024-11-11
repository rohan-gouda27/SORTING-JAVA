package Sorting;

import java.util.Arrays;

public class Sorting {
    static void swap(int[]arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    static void bubble(int[]arr){
        for(int i=0; i<arr.length-1;i++){
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
            }
        }
    }
static void selection(int []arr){
  for(int i=0; i<arr.length-1;i++){
      int min=i;
      for(int j=i+1;j<arr.length;j++){
          if(arr[min]>arr[j]){
              min=j;
          }
      }
      swap(arr,min,i);
  }
}
static void insertion(int[]arr){
    for (int i = 0; i < arr.length-1; i++) {
        for (int j = i + 1; j > 0; j--) {
            if (arr[j] < arr[j - 1]) {
                swap(arr, j, j - 1);
            } else {
                break;
            }
        }
    }
}
static void cyclic(int[]arr){
        int i=0;
        while(i<arr.length){
            int correctIndex=arr[i];
            if(arr[i]<arr.length && arr[i]!=arr[correctIndex]){
                swap(arr,i,correctIndex);
            }else {
                i++;
            }
        }
}
//static int[]
    public static void main(String[] args) {
        int[]arr={5,3,4,1,2,7,8};
        int[]arr1={5,4,2,1,3};
        int[]arr2={5,4,1,2,3};
        int[]arr3={3,0,1,2,6};
        insertion(arr2);
        selection(arr1);
        bubble(arr);
        cyclic(arr3);
//        System.out.println(Arrays.toString(arr3));/
        System.out.println(Arrays.toString(arr3));
    }
}
