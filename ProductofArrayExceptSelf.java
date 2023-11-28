package Arrays.letco;

//vist => YT => nikil
//Input: nums = [1,2,3,4]
//Output: [24,12,8,6]
//Example 2:
//
//Input: nums = [-1,1,0,-3,3]
//Output: [0,0,9,0,0]

import java.util.Arrays;

public class ProductofArrayExceptSelf {
    public static int[] productExceptSelf(int[] nums) {

        // Lookups
        // https://leetcode.com/problems/product-of-array-except-self/submissions/470802837/
        // https://leetcode.com/problems/product-of-array-except-self/submissions/672765619/

        // product of array except itself
        // [1,2,3,4]
        // [24,12,8,6]
        // IDEA -> [ans for an element] = product left side elements * product of right side elements
        // from the above example
        // 8 ==>  product of left elm(1*2) * product of right elms(4) == 8
        // 12 ==> (1) * (3*4) == 12

        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        int[] result = new int[nums.length];

        // construct left product array
        int leftProduct = 1;

        for (int i = 0; i < nums.length; i++) {
            left[i] = leftProduct;

            leftProduct *= nums[i];
        }

        System.out.println(Arrays.toString(left));
        // construct right product array

        int rightProduct = 1;

        for(int i = nums.length-1; i >= 0; i--) {
            right[i] = rightProduct; // for space(1) solution, here in this line we add multiply with left product, refer lookups
            rightProduct *= nums[i];
        }
        System.out.println(Arrays.toString(right));

        // construct product of array except itself

        for (int i = 0; i < nums.length; i++) {
            result[i] = left[i] * right[i];
        }
        System.out.println(Arrays.toString(right));

        return result;

    }

    public static void main(String[] args){

        int[] nums = {1,2,3,4};

        System.out.println(productExceptSelf(nums));

    }
}
