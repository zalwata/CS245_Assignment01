
/**
 * selection Sort
 * -> sorted vs unsorted
 *
 *  * best case: ??
 *  * worst case: O(n^2)
 *  * -> loops over entire array
 */

public class SelectionSort {

    /**
     * finds the smallest value in the array
     * @return smallest value from the array
     */
    public int findSmallestValue(int[] inputArray, int initVal)
    {
        int smallestValue = initVal;
        for(int i = initVal + 1; i < inputArray.length; i++)
        {
            if(inputArray[i] < inputArray[smallestValue])
            {
                smallestValue = i;
            }
        }
        return smallestValue;
    }

    /**
     * swap index positions of two values in the array
     * @return array after the swap
     */
    public int[] swap(int[] inputArray, int startVal , int endVal)
    {
        int tempVal = inputArray[startVal];
        inputArray[startVal] = inputArray [endVal];
        inputArray[endVal] = tempVal;
        return inputArray;
    }

    /**
     * initialize selection sort algorithm
     * @void
     */
    public void selectionSort(int[] randomArray)
    {
        for(int i = 0; i < randomArray.length; i++)
        {
            swap(randomArray, i, findSmallestValue(randomArray, i));
        }
    }


}
