package Arrays.letco.Codepratice;


//SearchInsertionposition
public class Search_Insertion_position {

    public int searchInsert(int[] nums, int target) {

        int low = 0;
        int high = nums.length - 1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid] == target) return mid;
            if(nums[mid] < target) low = mid + 1;
            else if(nums[mid] > target){
                high = mid - 1;
            }
        }
        return low;

    }
}
//Input: nums = [1,3,5,6], target = 5
//Output: 2

