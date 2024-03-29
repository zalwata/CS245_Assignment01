import java.util.Random;

public class SortingRunTimeTester {

    public static int ARRAYS_LENGTHS = 50000;
    public static double[] testingArray = new double[ARRAYS_LENGTHS];

    /**
     * runs bubble sort algorithm with the same testing array with random values
     * @return measured time in milli seconds
     */
    public static double bubbleSortEfficiencyTesting(double[] testingArray)
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
    public static double insertionSortEfficiencyTesting(double[] testingArray)
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
    public static double selectionSortEfficiencyTesting(double[] testingArray)
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
    public static double mergeSortEfficiencyTesting(double[] testingArray)
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
    public static double quickSortEfficiencyTesting(double[] testingArray)
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

    /**
     * runs randomised quick sort algorithm with random pivot
     * @return measured time in milli seconds
     */
    public static double randomisedQuickSortEfficiencyTesting(double[] testingArray)
    {
        double recordingStartTime = 0;
        double recordingEndTime = 0;
        double algorithmRunTime = 0;
        Part2_1RandomizedQuicksort sortingAlgorithmObj = new Part2_1RandomizedQuicksort();
        recordingStartTime = System.currentTimeMillis();
        sortingAlgorithmObj.randomisedQuicksort(testingArray);
        recordingEndTime = System.currentTimeMillis();
        algorithmRunTime = ((recordingEndTime - recordingStartTime)) / ARRAYS_LENGTHS;
        return algorithmRunTime;
    }

    /**
     * runs quadratic sort algorithm with the same testing array with random values
     * @return measured time in milli seconds
     */
    public static double quadraticSortEfficiencyTesting(double[] testingArray)
    {
        double recordingStartTime = 0;
        double recordingEndTime = 0;
        double algorithmRunTime = 0;
        Part2_2Quadraticsort sortingAlgorithmObj = new Part2_2Quadraticsort();
        recordingStartTime = System.currentTimeMillis();
        sortingAlgorithmObj.quadraticSort(testingArray);
        recordingEndTime = System.currentTimeMillis();
        algorithmRunTime = ((recordingEndTime - recordingStartTime)) / ARRAYS_LENGTHS;
        return algorithmRunTime;
    }

    /**
     * runs quadratic sort algorithm with the same testing array with random values
     * @return measured time in milli seconds
     */
    public static double hybridSortEfficiencyTesting(double[] testingArray)
    {
        double recordingStartTime = 0;
        double recordingEndTime = 0;
        double algorithmRunTime = 0;
        Part2_4HybridAlgorithm sortingAlgorithmObj = new Part2_4HybridAlgorithm();
        recordingStartTime = System.currentTimeMillis();
        sortingAlgorithmObj.initHybridsort(testingArray);
        recordingEndTime = System.currentTimeMillis();
        algorithmRunTime = ((recordingEndTime - recordingStartTime)) / ARRAYS_LENGTHS;
        return algorithmRunTime;
    }

    //generate array with random values
    public static double[] createRandomArray(double[] testingArray)
    {
        testingArray = new double[ARRAYS_LENGTHS];
        Random randomValueGenerator = new Random();
        for(int i=0;i < ARRAYS_LENGTHS;i++)
        {
            testingArray[i] = randomValueGenerator.nextInt();
        }
        return testingArray;
    }

    public static void main(String args[]) {

        //run time analysis on each sorting algorithm
        for(int i = 0; i < 20; i++)
        {
            testingArray = createRandomArray(testingArray);
            double[] listClone1 = testingArray.clone();
            double[] listClone2 = testingArray.clone();
            double[] listClone3 = testingArray.clone();
            double[] listClone4 = testingArray.clone();
            double[] listClone5 = testingArray.clone();
            double[] listClone6 = testingArray.clone();
            double[] listClone7 = testingArray.clone();
            double[] listClone8 = testingArray.clone();


            System.out.println("array size: " + ARRAYS_LENGTHS + "---------------------------------------------------");
            System.out.print("bubble sort run-time(ms):    ");
            System.out.println(bubbleSortEfficiencyTesting(listClone1));

            System.out.print("selection sort run-time(ms): ");
            System.out.println(selectionSortEfficiencyTesting(listClone2));

            System.out.print("insertion sort run-time(ms): ");
            System.out.println(insertionSortEfficiencyTesting(listClone3));
//
            System.out.print("merge sort run-time(ms):     ");
            System.out.println(mergeSortEfficiencyTesting(listClone4));
//
            System.out.print("quick sort run-time(ms):     ");
            System.out.println(quickSortEfficiencyTesting(listClone5));

            System.out.print("randomised quick sort run-time(ms):     ");
            System.out.println(randomisedQuickSortEfficiencyTesting(listClone6));

            System.out.print("quadratic sort run-time(ms):     ");
            System.out.println(quadraticSortEfficiencyTesting(listClone7));

            System.out.print("hybrid sort run-time(ms):     ");
            System.out.println(quadraticSortEfficiencyTesting(listClone8));

            ARRAYS_LENGTHS = ARRAYS_LENGTHS - 2500;
        }
    }


}