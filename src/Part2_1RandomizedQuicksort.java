import java.util.Random;
import java.util.Stack;

/**
 * Randomised Quick Sort
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

public class Part2_1RandomizedQuicksort {


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

//    //recursive quicksort
//    /**
//     * initialize quick sort
//     * @void
//     */
//    public void quickSort(int[] randomArray)
//    {
//        quickSort(randomArray, 0, randomArray.length);
//    }
//
//    /**
//     * recursive divide-and-conquer(split and merge) like merge sort
//     * pick pivot from median value
//     * @void
//     */
//    public void quickSort(int[] testingArray, int leftValue, int rightValue) {
//        int randomPivotIndex = 0;
//        if (rightValue - leftValue < 2) {
//            return;
//        }
//        randomPivotIndex = partitionAroundThePivot(testingArray, leftValue, rightValue);
//        quickSort(testingArray, leftValue, randomPivotIndex);
//        quickSort(testingArray, randomPivotIndex + 1, rightValue);
//    }
//
//    /**
//     * checks to make sure items in the array are arranged
//     * count up from bot until a value greater than the pivot is found
//     * count down from top until a value less than or equal to pivot is found
//     * swap the top/bot values
//     * move pivot to testingArray[top]
//     * @void
//     */
//    public int partitionAroundThePivot(int[] testingArray, int leftValue, int rightValue) {
//        int randomNum = new Random().nextInt(testingArray.length);
//        int randomisedPivot = testingArray[randomNum];
//        int bot = leftValue;
//        int top = rightValue;
//        while (bot < top) {
//            while ((bot < top)
//                    && (testingArray[--top] >= randomisedPivot));
//            if (bot < top) {
//                testingArray[bot] = testingArray[top];
//            }
//            while ((bot < top)
//                    && (testingArray[++bot] <= randomisedPivot));
//            if (bot < top) {
//                testingArray[top] = testingArray[bot];
//            }
//        }
//        testingArray[top] = randomisedPivot;
//        return top;
//    }

    //iterative quicksort
    class CoupledInterval
    {
        public int leftVal = 0;
        public int rightVal = 0;

        CoupledInterval(int left, int right)
        {
            this.leftVal = left;
            this.rightVal = right;
        }

        public int getLeftVal() { return leftVal; }
        public int getRightVal() { return rightVal; }
    }

    public void swap (double[] arr, int left, int right)
    {
        double temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    public int quicksort(double arr[], int left, int right)
    {
        if(right - left > 2)
        {
            int randomNum = new Random().nextInt((right - left + 1) + left) ;
            double randomisedPivot = arr[randomNum];
        }
        double randomisedPivot = arr[right];

        int pivotIndexVal = left;

        for (int i = left; i < right; i++)
        {
            if (arr[i] <= randomisedPivot)
            {
                swap(arr, i, pivotIndexVal);
                pivotIndexVal++;
            }
        }

        swap (arr, pivotIndexVal, right);

        return pivotIndexVal;
    }

    public void randomisedQuicksort(double[] arr)
    {
        Stack<CoupledInterval> sortedList = new Stack<>();

        int left = 0;
        int right = arr.length - 1;

        sortedList.push(new CoupledInterval(left, right));

        while (!sortedList.empty())
        {
            left = sortedList.peek().getLeftVal();
            right = sortedList.peek().getRightVal();
            sortedList.pop();

            int pivot = quicksort(arr, left, right);

            if (pivot - 1 > left) {
                sortedList.push(new CoupledInterval(left, pivot - 1));
            }

            if (pivot + 1 < right) {
                sortedList.push(new CoupledInterval(pivot + 1, right));
            }
        }
    }





}
