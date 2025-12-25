package Array_I;

import java.util.ArrayList;
import java.util.Arrays;

public class MargeSubIntervals {

    public static void mergeSubIntervals(int[][] intervals){
        Arrays.sort(intervals,(a,b) -> Integer.compare(a[0],b[0]));

        ArrayList<int[]> marged = new ArrayList<>();
        int[] currentInterval = intervals[0];
        marged.add(currentInterval);

        for(int[] interval : intervals){
            int currentEnd = currentInterval[1];
            int nextBegin = interval[0];
            int nextEnd = interval[1];

            if(currentEnd > nextBegin){
                currentInterval[1] = Math.max(currentEnd, nextEnd);
            } else {
                currentInterval = interval;
                marged.add(currentInterval);
            }
        }
        for(int[] interval : marged){
            System.out.println("["+interval[0]+","+interval[1]+"]");
        }
    }

    public static void main(String[] args) {
        int[][] intervals =
                {
                        {1,3},
                        {2,4},
                        {5,7},
                        {6,8}
                };
        mergeSubIntervals(intervals);
    }
}
