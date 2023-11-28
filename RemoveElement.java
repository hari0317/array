package Arrays.letco;

//Input: nums = [3,2,2,3], val = 3
//Output: 2, nums = [2,2,_,_]

import java.util.*;

public class RemoveElement {

    public static int removeElement(int[] nums, int val) {


       int counter = 0;

        for(int i = 0; i <nums.length; i++){
            if(nums[i] != val){
               nums[counter] = nums[i];
               counter++;

            }
        }
         return counter;
    }

    public static void main(String[] args){
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        System.out.print(removeElement(nums,val));

    }
}
