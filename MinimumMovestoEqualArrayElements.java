package Arrays.letco;

//Input: nums = [1,2,3]
//Output: 3
//Explanation: Only three moves are needed (remember each move increments two elements):
//[1,2,3]  =>  [2,3,3]  =>  [3,4,3]  =>  [4,4,4]
//Example 2:
//
//Input: nums = [1,1,1]
//Output: 0

// Logic =>
//checking for min no in array
//and find out difference between min no and all other numbers in array
//sum them to get the result
//eg -> {1,2} -> 1 is min
//[1-1 = 0 , 1-2 = 1] -> [0+1] => 1 result

import java.util.Arrays;

public class MinimumMovestoEqualArrayElements {

    public static int minMoves(int[] nums) {

        int min = Integer.MAX_VALUE;
        //finding the min in array
        for(int i : nums){
           min = Math.min(i,min);
        }
        int res = 0;
        //sum -> difference of nums[i] - min
        for (int j : nums){
            res += j - min;
        }
        return res;
    }

    public static void main(String[] args){

        int[] nums  = {1,1,1};
        System.out.print(minMoves(nums));

    }
}
