package Arrays.letco.Codepratice;
//Example 1:
//
//Input: nums = [1,3,4,2,2]
//Output: 2
//Example 2:
//
//Input: nums = [3,1,3,4,2]
//Output: 3

//Floyd’s cycle finding algorithm or Hare-Tortoise algorithm
// is a pointer algorithm that uses only two pointers, moving through the sequence at different speeds

//There another problem where the above algo is use -> Linked List Cycle

//Initialize two-pointers and start traversing.
//Move the slow pointer by one position.
//Move the fast pointer by two positions.
//If both pointers meet at some point then a loop exists
public class FindtheDuplicateNumber {
    public static int findDuplicate(int[] nums) {
        int slow = 0;
        int fast = 0;
        do{
            //Move the slow pointer by one position.
          //Move the fast pointer by two positions.
            slow = nums[slow];
            fast = nums[nums[fast]];
        }while(slow != fast);

     //As sson as they meet,moe both pointers at same speed until they meet again
    slow = 0;
    while(slow != fast){
        slow = nums[slow];
        fast = nums[fast];

    }
    return slow;
    }
    public static void main(String[] args){
        int[] nums = {1,3,4,2,2};
        System.out.println(findDuplicate(nums));


    }
}
