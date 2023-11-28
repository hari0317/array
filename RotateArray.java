package Arrays.letco;


import java.util.Arrays;

//Input: nums = [1,2,3,4,5,6,7], k = 3
//Output: [5,6,7,1,2,3,4]
//Explanation:
//rotate 1 steps to the right: [7,1,2,3,4,5,6]
//rotate 2 steps to the right: [6,7,1,2,3,4,5]
//rotate 3 steps to the right: [5,6,7,1,2,3,4]
public class RotateArray {

    public static void main(String[] args){
        int[] nums = {-1,-100,3,99};
        int k = 2;

        if(nums.length == 1 || nums == null){
            return;
        }

        int left = 0;
        int right = nums.length  - k;
        int nextleft = right + 1;

        System.out.print(right);



        while(left < right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
        System.out.println(Arrays.toString(nums));
        int nextright = nums.length - 1;
        while(nextleft < nextright){
            int temp = nums[nextleft];
            nums[nextleft] = nums[nextright];
            nums[nextright] = temp;
            nextleft++;
            nextright--;
        }

        System.out.println(nextleft);

        System.out.println(Arrays.toString(nums));

        int l = 0;
        int r = nums.length - 1;
        while(l < r){
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++;
            r--;
        }
        System.out.print(Arrays.toString(nums));



    }
}
