package Arrays.letco.Codepratice;
//Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
//      Output: 6
//Explanation: The subarray [4,-1,2,1] has the largest sum 6.

//using Kadane's Algorithm



//The idea of Kadane’s algorithm is to maintain a variable max_ending_here that stores the
// maximum sum contiguous subarray ending at current index
// and a variable max_so_far stores the maximum sum of contiguous subarray found so far,
// Everytime there is a positive-sum value in max_ending_here compare it with max_so_far
// and update max_so_far if it is greater than max_so_far.





public class MaximumSubarray {

    public static int maxSubArray(int[] nums) {
        int sum = 0;
        int max_sum = nums[0];

        //loop the array

        for(int i = 0; i < nums.length; i++){
            //sum the array
            sum += nums[i];

            //check if sum is greater than max_sum if so update max_sum = sum
            max_sum = Math.max(max_sum,sum);

            //if sum < 0 then make sum as 0
            if(sum < 0) sum =0;

        }

        return max_sum;
    }
    public static void main(String[] args){

        int[] arr = {-1};

      System.out.print(maxSubArray(arr));

    }
}
