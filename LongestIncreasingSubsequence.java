package Arrays.letco;

//DP APPROCH WITH MEMOIZATION

//Example 1:
//
//Input: nums = [10,9,2,5,3,7,101,18]
//Output: 4
//Explanation: The longest increasing subsequence is [2,3,7,101], therefore the length is 4.
//Example 2:
//
//Input: nums = [0,1,0,3,2,3]
//Output: 4
//Example 3:
//
//Input: nums = [7,7,7,7,7,7,7]
//Output: 1

// check base case nums length <= 1 return its length
//here we have two choice 1-> select 2 ->skip
// select ->

import java.util.Arrays;

public class LongestIncreasingSubsequence {
    public static int lengthOfLIS(int[] nums) {
        if(nums.length <= 1) return  nums.length;

        int[][] dp = new int[nums.length][nums.length + 1];

        for (int num[] : dp){
            Arrays.fill(num,-1);
        }



        return lis(nums,0,-1,dp);

    }
    public static int lis(int[] nums, int currentInd,int prevInd, int[][] dp){

        if(currentInd == nums.length) return 0;

        if(dp[currentInd][prevInd + 1] != -1) return  dp[currentInd][prevInd + 1];

        int skip = lis(nums,currentInd +1 ,prevInd,dp);
        int select = -1 ;

        if(prevInd == - 1 || nums[currentInd] > nums[prevInd]){
            select = 1 + lis(nums,currentInd + 1,currentInd,dp);
        }
        dp[currentInd][prevInd + 1]= Math.max(skip,select);

        return  dp[currentInd][prevInd + 1];

    }
    public  static void main(String[] args){
        int[] nums =  {0,1};

        System.out.print(lengthOfLIS(nums));

    }
}

// [0,1,0,3,2,3]
//       cur,prev
//index (0 , -1)
//         []
//      0               []
//   0,1  0
//         [0,3]
//