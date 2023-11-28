package Arrays.letco.Codepratice;

import java.util.HashMap;
import java.util.Map;

public class Codepractice {
    public static void main(String[] args){
        //Input: nums = [2,7,11,15], target = 9
        //Output: [0,1]

        Map<Integer,Integer>  map = new HashMap<>();

        Integer target = 18;

        int[] result = new int[2];


        Integer[] nums = new Integer[]{2,7,11,15};

        if(nums.length == 0 ||nums == null) return ;
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(target - nums[i] )){
                int d = target - nums[i];
                result[0] = map.get(d);
                result[1] = i;
                System.out.println( map.get(d) + " " + i);
            }else{
                map.put(nums[i],i);
               // System.out.print(map);
            }
        }




    }
}
