import java.util.Random;

public class SortingRunTimeTester {

    public static int ARRAYS_LENGTHS = 50000;
    public static int[] list = new int[ARRAYS_LENGTHS];

    //record run time for bubble sort
    public static double bubbleSortEfficiencyTesting(int[] list)
    {
        long startTime, endTime;
        double duration;
        BubbleSort sorter = new BubbleSort();

        startTime = System.currentTimeMillis();
        sorter.bubbleSort(list);
        endTime = System.currentTimeMillis();
        duration = ((double) (endTime - startTime)) / ARRAYS_LENGTHS;
        return duration;
    }

    //record run time for insertion sort
    public static double insertionSortEfficiencyTesting(int[] list)
    {
        long startTime, endTime;
        double duration;
        InsertionSort sorter = new InsertionSort();

        startTime = System.currentTimeMillis();
        sorter.insertionSort(list);
        endTime = System.currentTimeMillis();
        duration = ((double) (endTime - startTime)) / ARRAYS_LENGTHS;
        return duration;
    }

    //record run time for selection sort
    public static double selectionSortEfficiencyTesting(int[] list)
    {
        long startTime, endTime;
        double duration;
        SelectionSort sorter = new SelectionSort();

        startTime = System.currentTimeMillis();
        sorter.selectionSort(list);
        endTime = System.currentTimeMillis();
        duration = ((double) (endTime - startTime)) / ARRAYS_LENGTHS;
        return duration;
    }

    //record run time for merge sort
    public static double mergeSortEfficiencyTesting(int[] list)
    {
        long startTime, endTime;
        double duration;
        MergeSort sorter = new MergeSort();

        startTime = System.currentTimeMillis();
        sorter.mergeSort(list);
        endTime = System.currentTimeMillis();
        duration = ((double) (endTime - startTime)) / ARRAYS_LENGTHS;
        return duration;
    }

    //record run time for quick sort
    public static double quickSortEfficiencyTesting(int[] list)
    {
        long startTime, endTime;
        double duration;
        QuickSort sorter = new QuickSort();

        startTime = System.currentTimeMillis();
        sorter.quickSort(list);
        endTime = System.currentTimeMillis();
        duration = ((double) (endTime - startTime)) / ARRAYS_LENGTHS;
        return duration;
    }

    //generate array with random values
    public static int[] createRandomArray(int[] list)
    {
        list = new int[ARRAYS_LENGTHS];
        Random randomGenerator = new Random();
        for(int i=0;i < ARRAYS_LENGTHS;i++)
        {
            list[i] = randomGenerator.nextInt();
        }
        return list;
    }

    public static void main(String a[]) {

        //run time analysis on each sorting algorithm
        for(int i = 0; i < 10; i++)
        {
            list = createRandomArray(list);
            int[] listClone1 = list.clone();
            int[] listClone2 = list.clone();
            int[] listClone3 = list.clone();
            int[] listClone4 = list.clone();
            int[] listClone5 = list.clone();

            System.out.println("array size: " + ARRAYS_LENGTHS + "---------------------------------------------------");
            System.out.print("bubble sort run-time(ms):    ");
            System.out.println(bubbleSortEfficiencyTesting(listClone1));

            System.out.print("selection sort run-time(ms): ");
            System.out.println(selectionSortEfficiencyTesting(listClone2));

            System.out.print("insertion sort run-time(ms): ");
            System.out.println(insertionSortEfficiencyTesting(listClone3));

            System.out.print("merge sort run-time(ms):     ");
            System.out.println(mergeSortEfficiencyTesting(listClone4));

            System.out.print("quick sort run-time(ms):     ");
            System.out.println(quickSortEfficiencyTesting(listClone5));

            ARRAYS_LENGTHS = ARRAYS_LENGTHS + 50000;
        }
    }


}