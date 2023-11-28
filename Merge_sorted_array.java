package Arrays.letco.Codepratice;

import java.util.Arrays;

public class Merge_sorted_array {

    public static void main(String[] args){
       int[] nums1 = {1,3,0,0,0},nums2 = {0,2,5,6};
        int m = 2 , n = 4;

        int p1 = m-1;
        int p2 = n-1;
        int i = m + n -1;
        System.out.print(Arrays.toString(nums1));

        while(p2 >= 0){
            if(p1 > 0 && nums1[p1] > nums2[p2]){

                nums1[i--] = nums1[p1--];
        }else{
                nums1[i--] = nums2[p2--];
            }




    }
        System.out.print(Arrays.toString(nums1));
    }
}
