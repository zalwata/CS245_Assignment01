
/**
 * Insertion Sort
 * -> sorted vs unsorted
 * -> copy, move, copy back
 *
 * - in-place algorithm
 * - stable algorithm
 *
 * - O(n^2) time complexity - quadratic*
 *
 *  * best case: O(n)
 *  * worst case: O(n^2)
 */

public class InsertionSort {

//    //lecture code
//    int sort(float [] arr)
//    {
//        for(int i = 1; i < arr.length; i++)
//        {
//            float temp = arr[i]; //copy
//            int j = i - 1;
//            while(j >= 0 && arr[j] > temp) //move
//            {
//                arr[j + 1] = arr[j];
//                --j;
//            }
//            arr[j + 1] = temp; //copy back
//        }
//
//        return -1;
//    }

    /**
     * initialize insertion sort algorithm
     * @void
     */
    public void insertionSort(double[] randomArray)
    {
        int i = 0;
        double newValue = 0;
        for(int unsorted = 1; unsorted < randomArray.length; unsorted++)
        {
            newValue = randomArray[unsorted];
            for(i = unsorted; i > 0 && randomArray[i - 1] > newValue; i--)
            {
                randomArray[i] = randomArray[i - 1];
            }
            randomArray[i] = newValue;
        }
    }
}
