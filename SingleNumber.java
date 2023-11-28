package Arrays.letco;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//Example 1:
//
//Input: nums = [2,2,1]
//Output: 1
//Example 2:
//
//Input: nums = [4,1,2,1,2]
//Output: 4
//Example 3:
//
//Input: nums = [1]
//Output: 1

//logic => Bit operator technique
//since the problem should be without extra expace(O(1))
//Here we are using XOR (^) , since  It returns 0 if both bits are the same, else returns 1.
//2 ^ 2 = 0
public class SingleNumber {
    public static int singleNumber(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        int value = 0;
        for(int i = 0 ; i < nums.length; i++){
            value = value ^ nums[i];
        }
        return value;
    }
    public static void main(String[] args){
        int[] nums = {4,1,2,1,2};
        System.out.print(singleNumber(nums));


    }
}
