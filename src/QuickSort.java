
/**
 * Quick Sort
 * -> recursively divide-and-conquer(split and merge) - like Merge Sort
 * -> difficult divide, easy merge
 *
 * - in-place algorithm
 * - Unstable algorithm
 *
 * Ideal situation
 * - O(nlogn) time complexity
 * -> pivot is consistenly in the middle of the subarray
 *
 * average running time
 * - O(n log n)
 *
 * worst situation
 * - O(n^2)
 * -> pivot is consistently on one end of the subarray
 *
 */

public class QuickSort {


    public void quickSort(int[] randomArray)
    {
        quickSort(randomArray, 0, randomArray.length);
    }

    public static void quickSort(int[] input, int start, int end) {
        if (end - start < 2) {
            return;
        }

        int pivotIndex = partition(input, start, end);
        quickSort(input, start, pivotIndex);
        quickSort(input, pivotIndex + 1, end);
    }

    public static int partition(int[] input, int start, int end) {
        // This is using the first element as the pivot
        int pivot = input[start];
        int i = start;
        int j = end;

        while (i < j) {

            // NOTE: empty loop body
            while (i < j && input[--j] >= pivot);
            if (i < j) {
                input[i] = input[j];
            }

            // NOTE: empty loop body
            while (i < j && input[++i] <= pivot);
            if (i < j) {
                input[j] = input[i];
            }

        }

        input[j] = pivot;
        return j;

    }
}
