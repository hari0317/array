package Arrays.letco.Codepratice;

//Example 1:
//
//Input: nums = [-1,0,3,5,9,12],target = 9
////Output: 4
//Explanation: 9 exists in nums and its index is 4
//Example 2:
//
//Input: nums = [-1,0,3,5,9,12], target = 2
//Output: -1
//Explanation: 2 does not exist in nums so return -1


public class BinarySearch {
    public static int search(int[] nums, int target) {
        int l = 0;
        int h = nums.length - 1;
        while(l <= h){
            int mid = l + (h - l)/2;
            if(nums[mid] == target){
                return mid;
            }
            if(nums[mid] > target){
                h = mid - 1;
            }else{
                l = mid + 1;
            }
        }
        return -1;

    }
    public static void main(String[] args){
        int[] nums = {-1,0,3,5,9,12};
        int target = 0;
        System.out.println(search( nums,  target));

    }
}
