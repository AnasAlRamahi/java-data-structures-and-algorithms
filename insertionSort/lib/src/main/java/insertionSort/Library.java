/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package insertionSort;

import java.util.Arrays;

public class Library {
    public static void main(String[] args) {

        int[] testArr1 = {8, 4, 23, 42, 16, 15};
        int[] testArr2 = {20, 18, 12, 8, 5, -2};
        int[] testArr3 = {5, 12, 7, 5, 5, 7};
        int[] testArr4 = {2, 3, 5, 7, 13, 11};

        QuickSort.quickSort(testArr1);
        QuickSort.quickSort(testArr2);
        QuickSort.quickSort(testArr3);
        QuickSort.quickSort(testArr4);

//        System.out.println(Arrays.toString(InsertionSort.insertionSort(testArr1)));
//        System.out.println(Arrays.toString(InsertionSort.insertionSort(testArr2)));
//        System.out.println(Arrays.toString(InsertionSort.insertionSort(testArr3)));
//        System.out.println(Arrays.toString(InsertionSort.insertionSort(testArr4)));
//        MergeSort.mergeSort(testArr1);


//        System.out.println(Arrays.toString(MergeSort.mergeSort(testArr1)));
//        System.out.println(Arrays.toString(MergeSort.mergeSort(testArr2)));
//        System.out.println(Arrays.toString(MergeSort.mergeSort(testArr3)));
//        System.out.println(Arrays.toString(MergeSort.mergeSort(testArr4)));

//
        System.out.println(Arrays.toString(testArr1));
        System.out.println(Arrays.toString(testArr2));
        System.out.println(Arrays.toString(testArr3));
        System.out.println(Arrays.toString(testArr4));

    }
}
