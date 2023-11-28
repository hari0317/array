package Arrays.letco;
//easy

//Example 1:
//
//Input: nums1 = [1,2,2,1], nums2 = [2,2]
//Output: [2]
//Example 2:
//
//Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
//Output: [9,4]
//Explanation: [4,9] is also accepted.

import java.util.*;

public class IntersectionofTwoArrays {
    public static int[] intersection(int[] nums1, int[] nums2) {

        // created two hashset 1 -> to store nums1 array using this we can traverse through nums2 and check any value are intersecting
        // 2 -> to insert the intersection val
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> intersectval = new HashSet<>();

        for(int i : nums1){
            set.add(i);
        }
        System.out.println(set);

        for (int j : nums2){
            if(set.contains(j)){
                intersectval.add(j);
            }
        }

        int[] result = new int[intersectval.size()];
        int index = 0;
        for (int k : intersectval){
            result[index++] = k;
        }

        return  result;
    }

    public static void main(String[] args){

        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        System.out.print(Arrays.toString(intersection(nums1,nums2)));


    }
}
