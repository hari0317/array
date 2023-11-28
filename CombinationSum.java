package Arrays.letco;

import java.util.ArrayList;
import java.util.List;

//Input: candidates = [2,3,6,7], target = 7
//Output: [[2,2,3],[7]]
//Explanation:
//2 and 3 are candidates, and 2 + 2 + 3 = 7. Note that 2 can be used multiple times.
//7 is a candidate, and 7 = 7.
//These are the only two combinations.

public class CombinationSum {

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> ans = new ArrayList<>();


        findcombination(candidates,target,0,ans,new ArrayList<>());

        return ans;
    }

    public static void findcombination(int[] candidates,
                                int target , int index, List<List<Integer>> ans, List<Integer> ds)
    {
        int len = candidates.length;
        if(index == len){
            if(target == 0){

                ans.add(new ArrayList<>(ds));   //{2,3,6,7} target -> 7
//                int counter = 0;
//                System.out.println(ans + " " + counter++);
            }
            return;
        }

        if(candidates[index] <= target){
            ds.add(candidates[index]);
            findcombination(candidates,target-candidates[index],index,ans,ds);
            ds.remove(ds.size() - 1);
        }
        findcombination(candidates,target,index + 1,ans,ds);
    }

    public static void main(String[] args){
        int[] candidates = {1,1,2};
         int target = 4;
         System.out.print(combinationSum(candidates,target));


    }
}
