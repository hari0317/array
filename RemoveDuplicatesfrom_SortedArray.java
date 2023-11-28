package Arrays.letco.Codepratice;

import java.util.Arrays;

public class RemoveDuplicatesfrom_SortedArray {
    public static void main(String[] args){
        int[] nums = {1,1,1,3,4,4,4,5,5};

        // 1 3

        int k = 1;
        for (int i = 0; i < nums.length - 1; i++){
            if(nums[i] != nums[i+1]){
                nums[k] = nums[i + 1];
                k++;
            }
        }
        System.out.println(Arrays.toString(nums));
        System.out.print(k);
    }
}
