import java.util.Random;

public class AlgorithmValidityTester {

    public static int ARRAYS_LENGTHS = 5;

    /**
     * runs bubble sort algorithm with the same testing array with random values
     * to make sure this sorting algorithm produce same output as other algorithms
     * @void
     */
    public static void bubbleSortValidityTesting(int[] testingArray)
    {
        BubbleSort sortingAlgorithmObj = new BubbleSort();
        sortingAlgorithmObj.bubbleSort(testingArray);
        System.out.println("random array after sorting-----------------------------------------------------BUBBLESORT");
        System.out.print("[");
        for(int i=0;i < ARRAYS_LENGTHS;i++)
        {
            System.out.print(testingArray[i]);
            if(i != (ARRAYS_LENGTHS - 1))
            {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    /**
     * runs insertion sort algorithm with the same testing array with random values
     * to make sure this sorting algorithm produce same output as other algorithms
     * @void
     */
    public static void insertionSortValidityTesting(int[] testingArray)
    {
        InsertionSort sortingAlgorithmObj = new InsertionSort();
        sortingAlgorithmObj.insertionSort(testingArray);
        System.out.println("random array after sorting--------------------------------------------------INSERTIONSORT");
        System.out.print("[");
        for(int i=0;i < ARRAYS_LENGTHS;i++)
        {
            System.out.print(testingArray[i]);
            if(i != (ARRAYS_LENGTHS - 1))
            {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    /**
     * runs selection sort algorithm with the same testing array with random values
     * to make sure this sorting algorithm produce same output as other algorithms
     * @void
     */
    public static void selectionSortValidityTesting(int[] testingArray)
    {
        SelectionSort sortingAlgorithmObj = new SelectionSort();
        sortingAlgorithmObj.selectionSort(testingArray);
        System.out.println("random array after sorting--------------------------------------------------SELECTIONSORT");
        System.out.print("[");
        for(int i=0;i < ARRAYS_LENGTHS;i++)
        {
            System.out.print(testingArray[i]);
            if(i != (ARRAYS_LENGTHS - 1))
            {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    /**
     * runs merge sort algorithm with the same testing array with random values
     * to make sure this sorting algorithm produce same output as other algorithms
     * @void
     */
    public static void mergeSortValidityTesting(int[] testingArray)
    {
        MergeSort sortingAlgorithmObj = new MergeSort();
        sortingAlgorithmObj.mergeSort(testingArray);
        System.out.println("random array after sorting------------------------------------------------------MERGESORT");
        System.out.print("[");
        for(int i=0;i < ARRAYS_LENGTHS;i++)
        {
            System.out.print(testingArray[i]);
            if(i != (ARRAYS_LENGTHS - 1))
            {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    /**
     * runs quick sort algorithm with the same testing array with random values
     * to make sure this sorting algorithm produce same output as other algorithms
     * @void
     */
    public static void quickSortValidityTesting(int[] testingArray)
    {
        QuickSort sortingAlgorithmObj = new QuickSort();
        sortingAlgorithmObj.quickSort(testingArray);
        System.out.println("random array after sorting------------------------------------------------------QUICKSORT");
        System.out.print("[");
        for(int i=0;i < ARRAYS_LENGTHS;i++)
        {
            System.out.print(testingArray[i]);
            if(i != (ARRAYS_LENGTHS - 1))
            {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {

        //generate array with random values
        int[] testingArray = new int[ARRAYS_LENGTHS];
        Random randomValueGenerator = new Random();
        for(int i=0;i < ARRAYS_LENGTHS;i++)
        {
            testingArray[i] = randomValueGenerator.nextInt();
        }

        System.out.println("array size: " + AlgorithmValidityTester.ARRAYS_LENGTHS);
        //print the random array before sorting
        System.out.println("random array before sorting--------------------------------------------------------------");
        System.out.print("[");
        for(int i=0;i < ARRAYS_LENGTHS;i++)
        {
            System.out.print(testingArray[i]);
            if(i != (ARRAYS_LENGTHS - 1))
            {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        //run time analysis on each sorting algorithm
        int[] listClone1 = testingArray.clone();
        int[] listClone2 = testingArray.clone();
        int[] listClone3 = testingArray.clone();
        int[] listClone4 = testingArray.clone();
        int[] listClone5 = testingArray.clone();

        bubbleSortValidityTesting(listClone1);
        insertionSortValidityTesting(listClone2);
        selectionSortValidityTesting(listClone3);
        mergeSortValidityTesting(listClone4);
        quickSortValidityTesting(listClone5);
    }

}
