package Arrays.letco;


//WORST SOL

//Example 1:
//
//Input: nums = [1,1,1], k = 2
//Output: 2
//Example 2:
//
//Input: nums = [1,2,3], k = 3
//Output: 2
//



public class SubarraySumEqualsK_l_sol {

    public static  void main(String[] args){

        int[] nums = {1,2,3};
        int sumcount = 0;
        int target = 3;
        int sum = 0;
        int counter = 0;
        while(counter < nums.length){

            if(nums[counter] != target && sum != target){
                sum += nums[counter];
                if(sum == target){
                    sumcount++;
                    sum = 0;
                }

            }else{
                sumcount++;
                sum = 0;
            }

            counter++;
        }
        System.out.print(sumcount);

    }
}
