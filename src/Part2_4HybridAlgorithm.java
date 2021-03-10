/**
 * Hybrid algorithm
 * - calls randomised quicksort on large arrays
 * - calls quadratic sort for smaller arrays
 * - make implementation choice based on the length of the sub-array being sorted
 *
 * idea 1:
 * -> based on the experimental data, randomized quicksort performs O(n lg n) on large arrays.
 * -> need data for justification to see how randomized quicksort and quadratic sort performs on different sizes.
 *
 */

public class Part2_4HybridAlgorithm {

    public void initHybridsort (double[] arr)
    {
        int left = 0;
        int right = arr.length;
        Part2_4HybridAlgorithm sortingAlgorithmObj = new Part2_4HybridAlgorithm();
        sortingAlgorithmObj.hybridsort(arr, left, right);
    }

    public void hybridsort (double[] arr, int left, int right)
    {

        int threshholdLength = 2500;
        if((right - left) <= threshholdLength)
        {
            Part2_3ModifiedQuadraticsort sortingAlgorithmObj = new Part2_3ModifiedQuadraticsort();
            sortingAlgorithmObj.quadraticsort(arr, left, right);
        } else
        {
            Part2_1RandomizedQuicksort sortingAlgorithmObj = new Part2_1RandomizedQuicksort();
            sortingAlgorithmObj.randomisedQuicksort(arr);
        }
    }





}
