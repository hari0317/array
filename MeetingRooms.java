package Arrays.letco;

import java.util.Arrays;

//Example 1:
//
//Input: intervals = [[0,30],[5,10],[15,20]]
//Output: false
//Example 2:
//
//Input: intervals = [[7,10],[2,4]]
//Output: true

//[[7,10],
// [2,4]] [7,10]

//by sorting => [ ,4],[7,10]]
//check a[0][1] > a[1][0]
public class MeetingRooms {
    public static boolean canAttendMeetings(int[][] intervals){
        //sorting [][] using first index of each array
        Arrays.sort(intervals,(a,b) -> a[0] - b[0]);
        for(int i = 1; i < intervals.length; i++){
            //checking previous array last index val > next array first index val if so return false
            if(intervals[i - 1][1] > intervals[i][0]){
                return  false;
            }
        }
        return true;

        //[[5,8],[6,8]]
        //8 > 6

    }
    public static void main(String[] args)
    {
        int[][] intervals = {{5,8},{6,8}};

        System.out.print(canAttendMeetings(intervals));

    }
}
