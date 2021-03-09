
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

//    //lecture code
//    void quicksort(double[] arr, int bot, int top)
//    {
//        if(bot < top)
//        {
//            int p = partition(arr, bot, top);
//            quicksort(arr, bot, p-1);
//            quicksort(arr, p+1, top);
//        }
//    }
//    int partition(double[] arr, int left, int right)
//    {
//        if(left < right)
//        {
//            int pivot = left;
//            int bot = left + 1;
//            int top = right;
//            while(bot < top){
//                while(bot <= right && arr[bot] <= arr[pivot])
//                {
//                    ++bot;
//                }
//                while(top >= bot && arr[top] > arr[pivot])
//                {
//                    --top;
//                }
//                if(bot <= right && bot < top)
//                {
//                    swap(arr, bot, top);
//                }
//            }
//            swap (arr, pivot, top);
//            return top;
//        }
//        return left;
//    }

    /**
     * initialize quick sort
     * @void
     */
    public void quickSort(double[] randomArray)
    {
        quickSort(randomArray, 0, randomArray.length);
    }

    /**
     * recursive divide-and-conquer(split and merge) like merge sort
     * pick pivot from median value
     * @void
     */
    public void quickSort(double[] testingArray, int leftValue, int rightValue) {
        int medianPivotIndex = 0;
        if (rightValue - leftValue < 2) {
            return;
        }
        medianPivotIndex = partitionAroundThePivot(testingArray, leftValue, rightValue);
        quickSort(testingArray, leftValue, medianPivotIndex);
        quickSort(testingArray, medianPivotIndex + 1, rightValue);
    }

    /**
     * checks to make sure items in the array are arranged
     * count up from bot until a value greater than the pivot is found
     * count down from top until a value less than or equal to pivot is found
     * swap the top/bot values
     * move pivot to testingArray[top]
     * @void
     */
    public int partitionAroundThePivot(double[] testingArray, int leftValue, int rightValue) {
        double pivot = testingArray[leftValue];
        int bot = leftValue;
        int top = rightValue;
        while (bot < top) {
            while ((bot < top)
                    && (testingArray[--top] >= pivot));
            if (bot < top) {
                testingArray[bot] = testingArray[top];
            }
            while ((bot < top)
                    && (testingArray[++bot] <= pivot));
            if (bot < top) {
                testingArray[top] = testingArray[bot];
            }
        }
        testingArray[top] = pivot;
        return top;
    }
}
