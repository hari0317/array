package Arrays.letco;

//Input: nums = [3,0,1]
//Output: 2
//Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3].
// 2 is the missing number in the range since it does not appear in nums.
//Example 2:
//
//Input: nums = [0,1]
//Output: 2
//Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2].
// 2 is the missing number in the range since it does not appear in nums.
//Example 3:
//
//Input: nums = [9,6,4,2,3,5,7,0,1]
//Output: 8
//Explanation: n = 9 since there are 9 numbers, so all numbers
// are in the range [0,9]. 8 is the missing number in the range since it does not appear in nums.

//logic ==>
//Do summation of n numbers
//subactract summation from given array remaining value is the result
public class MissingNumber {
    public static int missingNumber(int[] nums) {
        int sum = 0;

        for(int i = 0; i <= nums.length; i++){
            sum += i;
        }

        for (int n : nums){
            sum -=n;
        }

        return  sum;

    }

    public static void main(String[] args){

        int[] nums = {9,6,4,2,3,5,7,0,1};
        System.out.print(missingNumber(nums));
    }
}