/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package insertionSort;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    // Insertion Sort Tests:
    @Test void insertionSortTest() {
        int[] testArr1 = {};
        int[] testArr2 = {55};
        int[] testArr3 = {8, 4, 23, 42, 16, 15};
        int[] testArr4 = {20, 18, 12, 8, 5, -2};
        int[] testArr5 = {5, 12, 7, 5, 5, 7};
        int[] testArr6 = {2, 3, 5, 7, 13, 11};

        assertEquals("[]", Arrays.toString(InsertionSort.insertionSort(testArr1)));
        assertEquals("[55]", Arrays.toString(InsertionSort.insertionSort(testArr2)));
        assertEquals("[4, 8, 15, 16, 23, 42]", Arrays.toString(InsertionSort.insertionSort(testArr3)));
        assertEquals("[-2, 5, 8, 12, 18, 20]", Arrays.toString(InsertionSort.insertionSort(testArr4)));
        assertEquals("[5, 5, 5, 7, 7, 12]", Arrays.toString(InsertionSort.insertionSort(testArr5)));
        assertEquals("[2, 3, 5, 7, 11, 13]", Arrays.toString(InsertionSort.insertionSort(testArr6)));
    }

    // Merge Sort Tests:
    @Test void mergeSortTest() {
        int[] testArr1 = {};
        int[] testArr2 = {55};
        int[] testArr3 = {8, 4, 23, 42, 16, 15};
        int[] testArr4 = {20, 18, 12, 8, 5, -2};
        int[] testArr5 = {5, 12, 7, 5, 5, 7};
        int[] testArr6 = {2, 3, 5, 7, 13, 11};

        assertEquals("[]", Arrays.toString(MergeSort.mergeSort(testArr1)));
        assertEquals("[55]", Arrays.toString(MergeSort.mergeSort(testArr2)));
        assertEquals("[4, 8, 15, 16, 23, 42]", Arrays.toString(MergeSort.mergeSort(testArr3)));
        assertEquals("[-2, 5, 8, 12, 18, 20]", Arrays.toString(MergeSort.mergeSort(testArr4)));
        assertEquals("[5, 5, 5, 7, 7, 12]", Arrays.toString(MergeSort.mergeSort(testArr5)));
        assertEquals("[2, 3, 5, 7, 11, 13]", Arrays.toString(MergeSort.mergeSort(testArr6)));
    }

}
