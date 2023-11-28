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

// using XOR
//Logic =>
//Step 1 - int xorval -> XOR all  the nos from 0-N and store in xorval
//step 2 -> again XOR all the array values (xorval ^ nums[i]) return xorval

//Since A^0 = A, A^A = 0

public class MissingNumbersol2 {
    public static  void main(String[] args){
        int[] nums = {0,1};
        int xorval1 = 0;

        for (int i = 0; i <= nums.length; i++){
            xorval1 ^= i;
        }



        int xorval2 = 0;
        for (int i : nums){
            xorval1 ^= i;
        }

    }
}
