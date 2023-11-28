package Arrays.letco;

//Input: nums = [1,2,3,4,5,6,7], k = 3
//Output: [5,6,7,1,2,3,4]

//Explanation:
// step 1 -- break the array using the k eg ---> k = 3 , [1,2,3,4] [5,6,7]
//step 2 -- then reverse the two array [4,3,2,1]
//step 3 --  reverse [7,6,5]
//step 4 -- now reverse whole array -> [4,3,2,1,7,6,5] ==> [7,6,5,4,3,2,1]





import java.util.Arrays;

public class RotateArrayOpt {


    public static void main(String[] args) {

        int[] nums = {-1,-100,3,99};
        int k = 2;

    rotate(nums,k);

    }

    //reversing the array
    static void reversearray(int start, int end, int[] arr) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

    }

    public static void rotate(int[] nums, int k) {
        if (k > nums.length) k = k % nums.length;

        int right = nums.length - 1 - k;

        //spliting and reversing first half
        reversearray(0, right, nums);

        //splitting and reversing second half
        reversearray(right + 1, nums.length - 1, nums);

        //reversing the reversed half
        reversearray(0, nums.length - 1, nums);

        System.out.print(nums);

    }
}
