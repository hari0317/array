//medium

//Input: nums = [1,2,3,1]
//Output: 2
//Explanation: 3 is a peak element and your function should return the index number 2.
//Example 2:
//
//Input: nums = [1,2,1,3,5,6,4]
//Output: 5
//Explanation: Your function can return either index number 1 where the peak element is 2, or index number 5 where the peak element is 6.

//Binary search Approach
package Arrays.letco;

//Algo --> Binary search
public class FindPeakElement {

   //we are going to check mid is less then mid + 1 if it so then make low as mid + 1  we are going to check right part by making low = mid + 1
    //mid  is greater then mid + 1 we are going to check left part from mid by making high = mid
    //return low
    public static int findPeakElement(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        while(low < high){
            int mid = low + (high - low) /2;
            // check if mid element is less then mid + 1 then low = mid + 1
            if(nums[mid] < nums[mid + 1]){
                low = mid + 1;
            }else{
                high = mid;
            }
        }
      return low;
}
public static void main(String[] args){
        int[] nums = {1,2,3,1 };
        System.out.print(findPeakElement(nums));

}
}
