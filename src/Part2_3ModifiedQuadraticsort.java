public class Part2_3ModifiedQuadraticsort {

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
    public void quadraticsort (double[] arr, int left, int right)
    {
        int i = left;
        double newValue = 0;
        if((right + 1) != (arr.length + 1))
        {
            for(int unsorted = i + 1; unsorted < right + 1; unsorted++)
            {
                newValue = arr[unsorted];
                for(left = unsorted; left > 0 && arr[left - 1] > newValue; left--)
                {
                    arr[left] = arr[left - 1];
                }
                arr[left] = newValue;
            }
        }

    }
}
