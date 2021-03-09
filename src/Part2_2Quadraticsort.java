
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
 *
 *  - You must defend your choice of this algorithm as part of your submission
 *  -> My choice of quadratic sorting is made exclusively based on the speed of the algorithm. As seen in the figure 1,
 *  when the data is plotted array size vs time, compare to other quadratic sorting algorithms such as bubble sort or
 *  selection sort, insertion sort outperformed the efficiency thoughtout the varying array sizes from 50000 to 500,000.
 */


public class Part2_2Quadraticsort {

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
    public void quadraticSort(double[] randomArray)
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
