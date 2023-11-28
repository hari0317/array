package Arrays.letco;

import java.util.ArrayList;

//Example 1:
//
//Input: nums = [4,2,3]
//Output: true
//Explanation: You could modify the first 4 to 1 to get a non-decreasing array.
//Example 2:
//
//Input: nums = [4,2,1]
//Output: false
//Explanation: You cannot get a non-decreasing array by modifying at most one element.
public class NondecreasingArray {
    public static boolean checkPossibility(int[] nums) {

        return true;
    }
    public static void main(String[] args){
        int[] nums = {3,4,2,3};
        System.out.print(checkPossibility(nums));


        // n[i - 2] n[i - 1] n[i]
        // conditions -> n[i -2 ] > n[i ] => convert n[i ] = n[i - 1]
        // condition 2 => n[i - 2] <= n[i] => convert n[i- 1] = n[i]

        // n[i - 2] > n[i]
        //n[i] == n[n- 1  ]


    }
}
