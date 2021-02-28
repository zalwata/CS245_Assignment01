import java.util.Random;
import java.util.concurrent.TimeUnit;

public class SortingTester {

    public final static int NUMITER = 10000;

    public static double bubbleSortEfficiencyTesting()
    {
        long startTime, endTime;
        double duration;
        int listsize = NUMITER;
        int[] list = new int[listsize];

        Random randomGenerator = new Random();
        BubbleSort sorter = new BubbleSort();
        for(int i=0;i < NUMITER;i++)
        {
            for (int j=0; j< listsize; j++)
                list[j] = randomGenerator.nextInt();
        }
        startTime = System.currentTimeMillis();
        sorter.bubbleSort(list,0,listsize-1);
        endTime = System.currentTimeMillis();
        duration = ((double) (endTime - startTime)) / NUMITER;
        return duration;
    }

    public static void main(String a[]) {

        for(int i = 0; i < 10; i++)
        {
            System.out.println(bubbleSortEfficiencyTesting());
        }

//        // calculate elapsed time in milli seconds
//        Long startTime = Instant.now().toEpochMilli();
//        try {
//            // do your business logic here
//            doYourBusinessLogic();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        Long endTime = Instant.now().toEpochMilli();
//        Long elapsedTime = endTime - startTime;
//        System.out.println("Elapsed time in milli seconds: "+elapsedTime);
//
//        // calculate elapsed time in seconds
//        Long stTimeInSec = Instant.now().getEpochSecond();
//        try {
//            // do your business logic here
//            doYourBusinessLogic();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        Long endTimeInSec = Instant.now().getEpochSecond();
//
//        elapsedTime = endTimeInSec - stTimeInSec;
//        System.out.println("Elapsed time in seconds: "+elapsedTime);
    }

    private static void doYourBusinessLogic() throws InterruptedException {

        TimeUnit.SECONDS.sleep(3);
    }
}