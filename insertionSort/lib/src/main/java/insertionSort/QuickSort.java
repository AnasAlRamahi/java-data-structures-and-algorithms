package insertionSort;

public class QuickSort {


    public static void quickSort(int[] arr){
        quick(arr, 0, arr.length-1);
    }

    private static void quick(int[] arr, int left, int right){
        if(left < right){
            int position = partition(arr, left, right);

            quick(arr, left, position - 1);

            quick(arr, position + 1 , right);
        }
    }

    private static int partition(int[] arr, int left, int right){
        int pivot = arr[right];
        int low = left - 1;
        for (int i = left ; i < right ; i++){
            if (arr[i] <= pivot){
                low++;
                swap(arr, i, low);
            }
        }
        swap(arr, right, low+1);
        return low+1;
    }

    private static void swap(int[] arr, int i, int low){
        int temp = arr[i];
        arr[i] = arr[low];
        arr[low] = temp;
    }
}

//    ALGORITHM QuickSort(arr, left, right)
//    if left < right
//// Partition the array by setting the position of the pivot value
//        DEFINE position <-- partition(arr, left, right)
//        // Sort the left
//        QuickSort(arr, left, position - 1)
//        // Sort the right
//        QuickSort(arr, position + 1, right)
//
//        ALGORITHM Partition(arr, left, right)
//        // set a pivot value as a point of reference
//        DEFINE pivot <-- arr[right]
//        // create a variable to track the largest index of numbers lower than the defined pivot
//        DEFINE low <-- left - 1
//        for i <- left to right do
//        if arr[i] <= pivot
//        low++
//        Swap(arr, i, low)
//
//        // place the value of the pivot location in the middle.
//        // all numbers smaller than the pivot are on the left, larger on the right.
//        Swap(arr, right, low + 1)
//        // return the pivot index point
//        return low + 1
//
//        ALGORITHM Swap(arr, i, low)
//        DEFINE temp;
//        temp <-- arr[i]
//        arr[i] <-- arr[low]
//        arr[low] <-- temp
