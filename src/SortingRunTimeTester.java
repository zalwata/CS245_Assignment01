import java.util.Random;

public class SortingRunTimeTester {

    public static int ARRAYS_LENGTHS = 50000;
    public static int[] testingArray = new int[ARRAYS_LENGTHS];

    /**
     * runs bubble sort algorithm with the same testing array with random values
     * @return measured time in milli seconds
     */
    public static double bubbleSortEfficiencyTesting(int[] testingArray)
    {
        double recordingStartTime = 0;
        double recordingEndTime = 0;
        double algorithmRunTime = 0;
        BubbleSort sortingAlgorithmObj = new BubbleSort();
        recordingStartTime = System.currentTimeMillis();
        sortingAlgorithmObj.bubbleSort(testingArray);
        recordingEndTime = System.currentTimeMillis();
        algorithmRunTime = ((recordingEndTime - recordingStartTime)) / ARRAYS_LENGTHS;
        return algorithmRunTime;
    }

    /**
     * runs insertion sort algorithm with the same testing array with random values
     * @return measured time in milli seconds
     */
    public static double insertionSortEfficiencyTesting(int[] testingArray)
    {
        double recordingStartTime = 0;
        double recordingEndTime = 0;
        double algorithmRunTime = 0;
        InsertionSort sortingAlgorithmObj = new InsertionSort();
        recordingStartTime = System.currentTimeMillis();
        sortingAlgorithmObj.insertionSort(testingArray);
        recordingEndTime = System.currentTimeMillis();
        algorithmRunTime = ((recordingEndTime - recordingStartTime)) / ARRAYS_LENGTHS;
        return algorithmRunTime;
    }

    /**
     * runs selection sort algorithm with the same testing array with random values
     * @return measured time in milli seconds
     */
    public static double selectionSortEfficiencyTesting(int[] testingArray)
    {
        double recordingStartTime = 0;
        double recordingEndTime = 0;
        double algorithmRunTime = 0;
        SelectionSort sortingAlgorithmObj = new SelectionSort();
        recordingStartTime = System.currentTimeMillis();
        sortingAlgorithmObj.selectionSort(testingArray);
        recordingEndTime = System.currentTimeMillis();
        algorithmRunTime = ((recordingEndTime - recordingStartTime)) / ARRAYS_LENGTHS;
        return algorithmRunTime;
    }

    /**
     * runs merge sort algorithm with the same testing array with random values
     * @return measured time in milli seconds
     */
    public static double mergeSortEfficiencyTesting(int[] testingArray)
    {
        double recordingStartTime = 0;
        double recordingEndTime = 0;
        double algorithmRunTime = 0;
        MergeSort sortingAlgorithmObj = new MergeSort();
        recordingStartTime = System.currentTimeMillis();
        sortingAlgorithmObj.mergeSort(testingArray);
        recordingEndTime = System.currentTimeMillis();
        algorithmRunTime = ((recordingEndTime - recordingStartTime)) / ARRAYS_LENGTHS;
        return algorithmRunTime;
    }

    /**
     * runs quick sort algorithm with the same testing array with random values
     * @return measured time in milli seconds
     */
    public static double quickSortEfficiencyTesting(int[] testingArray)
    {
        double recordingStartTime = 0;
        double recordingEndTime = 0;
        double algorithmRunTime = 0;
        QuickSort sortingAlgorithmObj = new QuickSort();
        recordingStartTime = System.currentTimeMillis();
        sortingAlgorithmObj.quickSort(testingArray);
        recordingEndTime = System.currentTimeMillis();
        algorithmRunTime = ((recordingEndTime - recordingStartTime)) / ARRAYS_LENGTHS;
        return algorithmRunTime;
    }

    //generate array with random values
    public static int[] createRandomArray(int[] testingArray)
    {
        testingArray = new int[ARRAYS_LENGTHS];
        Random randomValueGenerator = new Random();
        for(int i=0;i < ARRAYS_LENGTHS;i++)
        {
            testingArray[i] = randomValueGenerator.nextInt();
        }
        return testingArray;
    }

    public static void main(String args[]) {

        //run time analysis on each sorting algorithm
        for(int i = 0; i < 10; i++)
        {
            testingArray = createRandomArray(testingArray);
            int[] listClone1 = testingArray.clone();
            int[] listClone2 = testingArray.clone();
            int[] listClone3 = testingArray.clone();
            int[] listClone4 = testingArray.clone();
            int[] listClone5 = testingArray.clone();

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