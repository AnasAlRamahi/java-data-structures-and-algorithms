package insertionSort;

import java.util.Arrays;

public class MergeSort {

    public static int[] mergeSort(int[] arr){
        int n = arr.length;

        if (n > 1){
            int mid = n/2;
            int[] left = new int[mid];
            int[] right = new int[n-mid];

            for (int i = 0 ; i < mid ; i++){
                left[i] = arr[i];
            }
            for (int i = 0 ; i < n-mid ; i++){
                right[i] = arr[mid+i];
            }

            mergeSort(left);
            mergeSort(right);
            merge(left,right,arr);
        }
            return arr;
    }

    public static int[] merge(int[] left, int[] right, int[] arr) {
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left.length && j < right.length){

            if(left[i] <= right[i]){
                arr[k] = left[i];
                i += 1;
            }else{
                arr[k] = right[j];
                j += 1;
            }
            k += 1;
        }

        if (i == left.length){
            for(int l = j ; l < right.length ; l++){
                arr[k] = right[l];
                k += 1;
            }
        }else{
            for(int l = i ; l < left.length ; l++){
                arr[k] = left[l];
                k += 1;
            }
        }
        return arr;
    }
}
