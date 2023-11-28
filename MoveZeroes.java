package Arrays.letco;

import java.util.Arrays;

//Example 1:
//
//Input: nums = [0,1,0,3,12]
//Output: [1,3,12,0,0]
//Example 2:
//
//Input: nums = [0]
//Output: [0]
public class MoveZeroes {

  /*  public void moveZeroes(int[] nums) {

    } */

    public static void main(String[] args){

        int[] nums = {0,1,0,3,12};
        int index = 0;
        int i = 0;
        while(i < nums.length){
            if(nums[i] != 0){
                nums[index] = nums[i];
                index++;
                //System.out.print(Arrays.toString(nums));
            }
            i++;
        }
        for(int j = index; j < nums.length; j++){
            nums[j] = 0;
        }

        System.out.print(Arrays.toString(nums));

    }
}
