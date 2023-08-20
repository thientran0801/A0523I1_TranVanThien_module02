package ss04.bai_tap;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Date;
public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch() {
        startTime = System.currentTimeMillis();
    }

    public long getStartTime() {
        return this.startTime;
    }

    public long getEndTime() {
        return this.endTime;
    }
    public void start() {
        startTime = System.currentTimeMillis();
    }
    public void stop() {
        endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        if (endTime == 0) {
            return (System.currentTimeMillis() - startTime);
        }else {
            return (endTime - startTime);
        }
    }

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        int[] arrayNumber = new int[100000];
        for (int i = 0; i < arrayNumber.length; i++) {
            arrayNumber[i] = Math.toIntExact(Math.round(Math.random() * 100));
        }
        stopWatch.start();
        for (int i = 0; i < arrayNumber.length; i++) {
            for (int j = 1; j < arrayNumber.length - i; j++) {
                if (arrayNumber[j] < arrayNumber[j - 1]){
                    int temp = arrayNumber[j-1];
                    arrayNumber[j-1] = arrayNumber[j];
                    arrayNumber[j] = temp;
                }
            }
        }
//        Arrays.sort(arrayNumber);
//        long start = System.currentTimeMillis();
//        while (System.currentTimeMillis() - start <= 2000) {
//        }
//        try {
//            Thread.sleep(2000);
//            stopWatch.stop();
//        }catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        stopWatch.stop();
        System.out.println("Start time: " + stopWatch.getStartTime());
        System.out.println("End time: " + stopWatch.getEndTime());
        System.out.println("Elapsed time: " + stopWatch.getElapsedTime());
    }
}
