//easy

//Example 1:
//
//Input: nums = [1,1,2,2,2,3]
//Output: [3,1,1,2,2,2]
//Explanation: '3' has a frequency of 1, '1' has a frequency of 2, and '2' has a frequency of 3.
//Example 2:
//
//Input: nums = [2,3,1,3,2]
//Output: [1,3,3,2,2]
//Explanation: '2' and '3' both have a frequency of 2, so they are sorted in decreasing order.
//Example 3:
//
//Input: nums = [-1,1,-6,4,5,-6,1,4,1]
//Output: [5,-1,4,4,-6,-6,1,1,1]

package Arrays.letco;


import java.util.*;

public class SortArrayByIncreasingFrequency {
    public static int[] frequencySort(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();


        //Iterating the array and adding the frequency as value in map
        for(int i = 0 ; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.getOrDefault(nums[i],0) + 1);//map.get(nums[i]) + 1));
            }else{
                map.put(nums[i],1);
            }
        }

        //taking keyset alone and sorting using collections.sort with  compartor
        List<Integer> keyset = new ArrayList<>(map.keySet());


        Collections.sort(keyset,(a,b) -> {

            //if multiple value have same frequency b should appear first(decreasing order) else increasing order
            if(map.get(a) == map.get(b)){
                return  b - a;
            }else{
               return map.get(a) - map.get(b);
            }
        });

        int[] result = new int[nums.length];
        int index = 0;
        for (int i : keyset){
            System.out.println(i);
                for (int j = 0; j < map.get(i); j++){
                    result[index++] = i;
                }

            }


        return result;

    }
    public static void main(String[] args){
        int[]  nums = {1,1,2,2,2,3};
        System.out.print(Arrays.toString(frequencySort(nums)));

    }
}
