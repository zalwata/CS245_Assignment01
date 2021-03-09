
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
    public int findSmallestValue(double[] inputArray, int initVal)
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
    public double[] swap(double[] inputArray, int startVal , int endVal)
    {
        double tempVal = inputArray[startVal];
        inputArray[startVal] = inputArray [endVal];
        inputArray[endVal] = tempVal;
        return inputArray;
    }

    /**
     * initialize selection sort algorithm
     * @void
     */
    public void selectionSort(double[] randomArray)
    {
        for(int i = 0; i < randomArray.length; i++)
        {
            swap(randomArray, i, findSmallestValue(randomArray, i));
        }
    }


}
