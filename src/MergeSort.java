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

    /*
    lecture code
    double[] get_left(double[] arr)
    {
        int size = arr.length/2;
        double[] left = new double[size];
        for(int i = 0; i < size; i++)
        {
            left[i] = arr[i];
        }
        return left;
    }

//    void mergesort(double[] arr)
//    {
//        if(arr.length > 1)
//        {
//            double[] left = get_left(arr);
//            double[] right = get_right(arr);
//            mergesort(left);
//            mergesort(right);
//            merge(arr,left, right);
//        }
//    }

     */

    /**
     * redistribute merge sort algorithm to make sure items in the array are arranged
     * @void
     */
    public void mergeSortInit(int[] testingArray, int leftValue, int rightValue)
    {
        int middleValue = 0;
        //base case for organizing
        if(rightValue - leftValue < 2)
        {
            return;
        }
        middleValue = (leftValue + rightValue)/2;
        mergeSortInit(testingArray, leftValue, middleValue);
        mergeSortInit(testingArray, middleValue, rightValue);
        mergeThePartitionedArrays(testingArray, leftValue, middleValue, rightValue);
    }

    /**
     * checks to make sure items in the array are arranged from left to right (least to greatest)
     * then merge two adjacent sub-arrays, keeping sorted order
     * @void
     */
    public void mergeThePartitionedArrays(int[] testingArray, int leftValue, int middleValue, int rightValue)
    {
        int partitioningIndex = 0;
        int leftPartitionIndex = 0;
        int rightPartitionIndex = 0;
        int[] partitioningArray;
        if(testingArray[middleValue - 1] <= testingArray[middleValue])
        {
            return;
        }
        leftPartitionIndex = leftValue;
        rightPartitionIndex = middleValue;
        partitioningArray = new int[rightValue - leftValue];
        while((leftPartitionIndex < middleValue) && (rightPartitionIndex < rightValue))
        {
            if(testingArray[leftPartitionIndex] <= testingArray[rightPartitionIndex])
            {
                partitioningArray[partitioningIndex++] = testingArray[leftPartitionIndex++];
            }
            if((testingArray[leftPartitionIndex] != testingArray[rightPartitionIndex])
                    || (testingArray[leftPartitionIndex] > testingArray[rightPartitionIndex]))
            {
                partitioningArray[partitioningIndex++] = testingArray[rightPartitionIndex++];
            }
            //partitioningArray[partitioningIndex++] = testingArray[leftPartitionIndex] <= testingArray[rightPartitionIndex] ? testingArray[leftPartitionIndex++] : testingArray[rightPartitionIndex++];
        }

        System.arraycopy(testingArray, leftPartitionIndex, testingArray, leftValue + partitioningIndex,
                middleValue - leftPartitionIndex);
        System.arraycopy(partitioningArray, 0, testingArray, leftValue, partitioningIndex);
    }

    /**
     * initialize merge sort
     * @void
     */
    public void mergeSort(int[] randomArray)
    {
        mergeSortInit(randomArray, 0, randomArray.length);
    }

}
