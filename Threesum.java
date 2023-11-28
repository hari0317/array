package Arrays.letco;

import java.util.*;

public class Threesum {

    public static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();
        Arrays.sort(nums);

        for(int i = 0; i < nums.length -2 ; i++){
            int start = i + 1;
            int end = nums.length - 1;
            while(start < end){
                int target = nums[i] + nums[start] + nums[end];
                if(target == 0){
                    result.add(Arrays.asList(nums[i],nums[start],nums[end]));
                    start++;
                    end--;
                }else if(target < 0){
                    start++;
                }else{
                    end--;
                }
            }
        }
        return new ArrayList<>(result);

    }
    public static void main(String[] args){
        int[]  nums = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));

    }
}
