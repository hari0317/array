package Arrays.letco;


//
//Input: nums = [4,5,6,7,0,1,2], target = 0
//Output: 4
//Example 2:
//
//Input: nums = [4,5,6,7,0,1,2], target = 3
//Output: -1
//Example 3:
//
//Input: nums = [1], target = 0
//Output: -1

public class SearchinRotatedSortedArray {

    public static  int search(int[] nums, int target){
        int l = 0;
        int h = nums.length - 1;
        while(l <= h){
            int mid = l + (h - l)/2;
            if(nums[mid] == target) return mid;

            //if left side of mid is sorted
            if(nums[mid] >= nums[l]){
                if(target >= nums[l] && target < nums[mid]){
                    h = mid - 1;
                }else{
                    l = mid + 1;
                }
                //if right side of mid is sorted
            }else{
                if(target >= nums[mid] && target < nums[h]){
                    l = mid + 1;
                }else{
                    h = mid - 1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args){

        int[]  nums = {1};
        int target = 3;
        System.out.println(search(nums,target));

    }
}
