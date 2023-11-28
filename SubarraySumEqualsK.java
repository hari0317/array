package Arrays.letco;

import java.util.HashMap;
import java.util.Map;

//if it contains in map counter++

//Example 1:
//
//Input: nums = [1,1,1], k = 2
//Output: 2
//Example 2:
//
//Input: nums = [1,2,3], k = 3
//Output: 2

// https://www.youtube.com/watch?v=HbbYPQc-Oo4

// Use cumulative sum
// store it in map with its number of occurrences
// use the concept of
// sum - k = val [if val exists in the map, ie. there exist a sub array sequence that is K + val]
// keep a counter and initialize to 1 when sum ==k
// and increment it if map contains key for (sum-k)

public class  SubarraySumEqualsK{
    public static int subarraySum(int[] nums, int k) {
        int counter = 0;
        int sum = 0;
        Map<Integer,Integer> prefixsum = new HashMap<>();

        for(int i = 0; i < nums.length; i++){

            sum += nums[i];
            int val = sum - k;

            if (sum == k)
                counter++;

            if( prefixsum.containsKey(val)){
                counter += prefixsum.get(sum-k);
            }


            prefixsum.put(sum, prefixsum.getOrDefault(sum, 0) + 1);
        }


        return counter;

    }


    public static void main(String[] args){

        int[] nums = {1,-1,0};
        int k = 0;

        System.out.print(subarraySum(nums,k));

    }
        }
