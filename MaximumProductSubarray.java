package Arrays.letco;


//Kadanes algo

//TODO


//Input: nums = [2,3,-2,4]
//Output: 6
//Explanation: [2,3] has the largest product 6.
//Example 2:
//
//Input: nums = [-2,0,-1]
//Output: 0
//Explanation: The result cannot be 2, because [-2,-1] is not a subarray.

public class MaximumProductSubarray {
    public static int maxProduct(int[] nums) {

        int leftproduct = 1;
        int rightproduct = 1;
        int res = nums[0];
        int j = nums.length - 1;

        for(int i = 0 ; i < nums.length; i++ ,j--){

            //if there is 0 in arr we will split as subarray by making 0 as 1

            leftproduct = leftproduct == 0 ? 1 : leftproduct;
            rightproduct = rightproduct == 0 ? 1: rightproduct;

            leftproduct *= nums[i];
            rightproduct *= nums[j];
            System.out.println(leftproduct);
            System.out.println(rightproduct);


            res = Math.max(res,Math.max(leftproduct,rightproduct));



        }
        return  res;
    }
    public static void main(String[] args){

        int[] nums = {2,3,-2,4};
        System.out.print(maxProduct(nums));

    }
}
