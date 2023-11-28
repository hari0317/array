package Arrays.letco.Codepratice;

//Input: nums = [2,3,1,1,4]
//Output: true
//Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
//Example 2:
//
//Input: nums = [3,2,1,0,4]
//Output: false
//Explanation: You will always arrive at index 3 no matter what. Its maximum jump length is 0, which makes it impossible to reach the last index.


//Greedy approch
//2 -> means we jump maximum 2 jumps or below
//logic -|>
//Lets take last element as our destination(nums.length - 1)
//and check whether we can reach final destination from previous index(nums.length - 2)
//if so make previous index as final destination (nums.length - 2)
//and check whether we canreach  from its previous index(nums.length - 3) and so on
//check whether we can reach to first index . If this is the case return true else false
//always update current destination = currentDestination
public class JumpGame {
    public boolean canJump(int[] nums) {
        int currentDestination = nums.length - 1;

        for(int index = nums.length - 2; index >= 0; index--){
            //checking whether we can reach our currentDestination from prev ind (index + nums[i])
            //else decrease the index
            if( index + nums[index] >= currentDestination){
                //update the currentDestina by index
                currentDestination = index;
            }

        }

        return currentDestination == 0;

    }
}

