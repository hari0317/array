package Arrays.letco.Codepratice;
//Input: nums = [3,2,3]
//Output: 3
//Example 2:
//
//Input: nums = [2,2,1,1,1,2,2]
//Output: 2

//logic
//First assign nums[0] = candidate ,found = 1
//check if nums[i] == candidate if so increment or decrement
//if nums[i] != candidate and found = 0 -> make nums[i] as new candidate and found = 1

//USED ALGO => Moore Voting Algorithm
//Moore's Voting Algorithm is based on the fact that if there is a majority element in an array,
// it will always remain in the lead, even after encountering other elements.

public class MajorityElement {
    public int majorityElement(int[] nums) {
        int candidate = nums[0];
        int found = 1;

        for(int i = 1 ; i < nums.length;i++){
            if(nums[i] == candidate){
                found++;
            }else{
                found--;
                if(found == 0){
                    candidate = nums[i];
                    found = 1;
                }
            }
        }
        return candidate;

    }

    public static void main(String[] args){
        int[] nums = {3,2,3};





    }
}
