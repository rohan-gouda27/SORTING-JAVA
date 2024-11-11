package Sorting;
import java.util.Arrays;
public class MergeSort_Recursion {
    static void  MergeInPlace(int[]arr,int start,int end){
        if(end-start==1){
            return;
        }
        int mid=(start+end) /2;

        MergeInPlace(arr,start,mid);
        MergeInPlace(arr,mid,end);

        mergePlace( arr,start,mid,end);
    }

    private static void mergePlace(int[] arr, int start, int mid, int end) {
        int[] mix = new int[end - start];
        int i = start;
        int j = mid;
        int k = 0;
        while (i < mid && j < end) {
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i<mid){
            mix[k]=arr[i];
            i++;
            k++;
        }
        while (j<end){
          mix[k]=arr[j];
            j++;
            k++;
        }
        for (int l = 0; l <mix.length ; l++) {
            arr[start+l]=mix[l];
        }
    }
    public static void main(String[] args) {
    int[]arr={6,2,4,7,1};
    MergeInPlace(arr,0,arr.length);
    System.out.println(Arrays.toString(arr));
    }
}
