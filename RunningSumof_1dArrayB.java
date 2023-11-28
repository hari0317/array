package Arrays.letco.Codepratice;

import java.util.Arrays;

public class RunningSumof_1dArrayB {
    public static void main(String[] args){
        int[] nums = {1,1,1,1};
        int[] result = new int[nums.length];
        int sum = 0;
        for(int i = 0; i < nums.length; i++){

            sum += nums[i];
           result[i] = sum;

        }
        System.out.print(Arrays.toString(result));
    }
}
