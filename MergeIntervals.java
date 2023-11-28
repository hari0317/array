package Arrays.letco;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

//Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
//Output: [[1,6],[8,10],[15,18]]
//Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].
//Example 2:
//
//Input: intervals = [[1,4],[4,5]]
//Output: [[1,5]]
//Explanation: Intervals [1,4] and [4,5] are considered overlapping.

public class MergeIntervals {
    public static int[][] merge(int[][] intervals) {
     Arrays.sort(intervals,(a,b) -> Integer.compare(a[0],b[0]));

     LinkedList<int[]> list = new LinkedList<>();

     list.add(intervals[0]);
     for(int i = 1; i < intervals.length;i++){
         int[] currnode = intervals[i];
         if(list.getLast()[1] < currnode[0]){
             list.add(currnode);
         }else {
             list.getLast()[1] = Math.max(currnode[1],list.getLast()[1]);
         }
     }
     return list.toArray(new int[list.size()][2]);

}
    public static void main(String[] args){

        int[][] intervals = {{1, 3},{2,6},{8,10},{15,18}};
        System.out.println(merge(intervals));



    }
}
