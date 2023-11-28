package Arrays.letco;

import java.util.HashMap;
import java.util.Map;

//Input: nums = [23,2,4,6,7], k = 6
//Output: true
//Explanation: [2, 4] is a continuous subarray of size 2 whose elements sum up to 6.
//Example 2:
//
//Input: nums = [23,2,6,4,7], k = 6
//Output: true
//Explanation: [23, 2, 6, 4, 7] is an continuous subarray of size 5 whose elements sum up to 42.
//42 is a multiple of 6 because 42 = 7 * 6 and 7 is an integer.
//Example 3:
//
//Input: nums = [23,2,6,4,7], k = 13
//Output: false
//
public class ContinuousSubarraySum {
    static Map<Integer, Integer> map;
    public static boolean checkSubarraySum(int[] nums, int k) {
        map = new HashMap(); // key: rolling sum% k, val: array index
        map.put(0, -1);
        int sum =0;
        for(int i=0; i<nums.length; i++){
            sum+=nums[i];
            int mod = k==0? sum:sum%k; //compute sum%k
            //when map contains mod, it means that there exist an subarray from 0~j (j=map.get(mod)) where its sum%k==mod.
            //which means that subarray sum( j~i) %k==0.

            if(map.containsKey(mod) && i-map.get(mod)>1) return true;
            map.putIfAbsent(mod,i);
        }
        return false;
    }
    public static void main(String[] args){
        int[] nums = {5,0,0,0};
        int k = 3;

        System.out.println(checkSubarraySum(nums, k) );

    }
}
