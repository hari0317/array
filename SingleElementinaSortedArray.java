package Arrays.letco.Codepratice;
//Example 1:
//
//Input: nums = [1,1,2,3,3,4,4,8,8]
//Output: 2
//Example 2:
//
//Input: nums = [3,3,7,7,10,11,11]
//Output: 1

//1. Take left and right pointers .
//    left points to start of list. right points to end of the list.
//2. find mid. if mid is even, then it's duplicate should be in next index.
//	or if mid is odd, then it's duplicate  should be in previous index.
//	check these two conditions, if any of the conditions is satisfied,
//	then pattern is not missed,
//	so check in next half of the array. i.e, left = mid + 1
//	if condition is not satisfied, then the pattern is missed.
//	so, single number must be before mid.
//	so, update end to mid.
//3. At last return the nums[left]
public class SingleElementinaSortedArray {

    public static int singleElement(int[] nums ){
        int l = 0;
        int h = nums.length - 1;
        while (l < h){
            int mid = l + (h - l) / 2;
            //find mid. if mid is even, then it's duplicate should be in next index.
            //	or if mid is odd, then it's duplicate  should be in previous index.
            if(mid % 2 == 0 && nums[mid] == nums[mid + 1] || mid % 2 ==1 && nums[mid] == nums[mid - 1]){
                l = mid + 1;
            }else{
                h = mid;
            }

        }
        return nums[l];
    }

    public static void main(String[] args){
        int[] nums = {1,1,2,3,3,4,4,8,8};
        System.out.print(singleElement(nums ));

    }
}
