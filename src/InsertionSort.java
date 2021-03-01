
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

    public void insertionSort(int[] randomArray)
    {
        for(int firstUnsortedIndex = 1; firstUnsortedIndex < randomArray.length; firstUnsortedIndex++)
        {
            int newElement = randomArray[firstUnsortedIndex];
            int i ;
            for(i = firstUnsortedIndex; i > 0 && randomArray[i - 1] > newElement; i--)
            {
                randomArray[i] = randomArray[i - 1];
            }

            randomArray[i] = newElement;
        }
    }
}
