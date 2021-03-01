import java.util.Random;

public class AlgorithmValidityTester {

    public static int ARRAYS_LENGTHS = 5;

    //record run time for bubble sort
    public static void bubbleSortValidityTesting(int[] list)
    {
        BubbleSort sorter = new BubbleSort();
        sorter.bubbleSort(list);
        System.out.println("random array after sorting-----------------------------------------------------BUBBLESORT");
        System.out.print("[");
        for(int i=0;i < ARRAYS_LENGTHS;i++)
        {
            System.out.print(list[i]);
            if(i != (ARRAYS_LENGTHS - 1))
            {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    //record run time for insertion sort
    public static void insertionSortValidityTesting(int[] list)
    {
        InsertionSort sorter = new InsertionSort();
        sorter.insertionSort(list);
        System.out.println("random array after sorting--------------------------------------------------INSERTIONSORT");
        System.out.print("[");
        for(int i=0;i < ARRAYS_LENGTHS;i++)
        {
            System.out.print(list[i]);
            if(i != (ARRAYS_LENGTHS - 1))
            {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    //record run time for selection sort
    public static void selectionSortValidityTesting(int[] list)
    {
        SelectionSort sorter = new SelectionSort();
        sorter.selectionSort(list);
        System.out.println("random array after sorting--------------------------------------------------SELECTIONSORT");
        System.out.print("[");
        for(int i=0;i < ARRAYS_LENGTHS;i++)
        {
            System.out.print(list[i]);
            if(i != (ARRAYS_LENGTHS - 1))
            {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    //record run time for merge sort
    public static void mergeSortValidityTesting(int[] list)
    {
        MergeSort sorter = new MergeSort();
        sorter.mergeSort(list);
        System.out.println("random array after sorting------------------------------------------------------MERGESORT");
        System.out.print("[");
        for(int i=0;i < ARRAYS_LENGTHS;i++)
        {
            System.out.print(list[i]);
            if(i != (ARRAYS_LENGTHS - 1))
            {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    //record run time for quick sort
    public static void quickSortValidityTesting(int[] list)
    {
        QuickSort sorter = new QuickSort();
        sorter.quickSort(list);
        System.out.println("random array after sorting------------------------------------------------------QUICKSORT");
        System.out.print("[");
        for(int i=0;i < ARRAYS_LENGTHS;i++)
        {
            System.out.print(list[i]);
            if(i != (ARRAYS_LENGTHS - 1))
            {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {

        //generate array with random values
        int listsize = ARRAYS_LENGTHS;
        int[] list = new int[listsize];
        Random randomGenerator = new Random();
        for(int i=0;i < listsize;i++)
        {
            list[i] = randomGenerator.nextInt();
        }

        System.out.println("array size: " + ARRAYS_LENGTHS);
        //print the random array before sorting
        System.out.println("random array before sorting--------------------------------------------------------------");
        System.out.print("[");
        for(int i=0;i < listsize;i++)
        {
            System.out.print(list[i]);
            if(i != (listsize - 1))
            {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        //run time analysis on each sorting algorithm
        int[] listClone1 = list.clone();
        int[] listClone2 = list.clone();
        int[] listClone3 = list.clone();
        int[] listClone4 = list.clone();
        int[] listClone5 = list.clone();

        bubbleSortValidityTesting(listClone1);
        insertionSortValidityTesting(listClone2);
        selectionSortValidityTesting(listClone3);
        mergeSortValidityTesting(listClone4);
        quickSortValidityTesting(listClone5);



    }

}
