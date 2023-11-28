package Arrays.letco.Codepratice;

import java.util.Arrays;

public class RunningSumof_1dArray {
    public static void main(String[] args){
        int[] nums = {1,2,1,4,1};
        int sum = 0;
        int[] result = new int[nums.length];
        result[0] = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(i == 1){
                sum += nums[i -1] + nums[i]; // 1 + 1 = 2
                result[i] = sum;
            }else{
                System.out.println(sum);
                sum += nums[i];
                result[i] = sum ;


            }
            
            System.out.print(Arrays.toString(result));



        }
    }
}
