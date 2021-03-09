/**
 * Bubble Sort
 * -> larger the bubble, faster it will rise into surface in water(larger buoyant force).
 *
 * - in-place algorithm
 * -> a sorting algorithm which don't take extra space other than your given array
 * -> it means in a algorithm do not create an array externally to sort an element then that type of algorithm known
 * as in place algorithm
 *
 * - O(n^2) time complexity - quadratic
 * -> each loop is O(n) time complexity. loop within another loop (nested loop) is O(n)*O(n) = O(n^2)
 *
 * - algorithm degrades quickly
 * -> in other words, algorithm performance loses its efficiency and will result as slow performance
 *
 *  * best case: O(n)
 *  * -> array is in sorted order
 *  * -> early termination: 1 pass through the array determines sorted order
 *  * worst case: O(n^2)
 *  * -> array is in reverse sorted order
 */

public class BubbleSort {

    /**
     * initialize bubble sort algorithm
     * @void
     */
    public void bubbleSort(double[] randomArray)
    {
        for(int unsorted = randomArray.length - 1; unsorted > 0; unsorted--)
        {
            for (int i = 0; i < unsorted; i++)
            {
                if(randomArray[i] > randomArray[i+1])
                {
                    swap(randomArray, i, i+1);
                }
            }
        }
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
}
