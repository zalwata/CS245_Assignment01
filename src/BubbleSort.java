public class BubbleSort {

    public void bubbleSort(int[] randomArray)
    {
        for(int lastUnsortedIndex = randomArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--)
        {
            for (int i = 0; i < lastUnsortedIndex; i++)
            {
                if(randomArray[i] > randomArray[i+1])
                {
                    swap(randomArray, i, i+1);
                }
            }
        }
    }

    public void swap(int[] array, int i, int j)
    {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
