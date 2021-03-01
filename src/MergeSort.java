/**
 * Merge Sort
 * -> divide into smaller arrays
 *
 * - Not in-place algorithm
 * - stable algorithm
 *
 * - O(nlogn) time complexity
 *
 */

public class MergeSort {

    public void mergeSortInit(int[] input, int start, int end)
    {
        if(end - start < 2)
        {
            return;
        }

        int mid = (start + end)/2;
        mergeSortInit(input, start, mid);
        mergeSortInit(input, mid, end);
        merge(input, start, mid, end);
    }

    public void merge(int[] input, int start, int mid, int end)
    {
        if(input[mid - 1] <= input[mid])
        {
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end - start];
        while(i < mid && j < end)
        {
            temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
        }

        System.arraycopy(input, i, input, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, input, start, tempIndex);
    }

    public void mergeSort(int[] randomArray)
    {
        mergeSortInit(randomArray, 0, randomArray.length);
    }

}
