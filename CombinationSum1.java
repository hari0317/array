package Arrays.letco.Codepratice;

//Input: candidates = [2,3,6,7], target = 7
//Output: [[2,2,3],[7]]
//Explanation:
//2 and 3 are candidates, and 2 + 2 + 3 = 7. Note that 2 can be used multiple times.
//7 is a candidate, and 7 = 7.
//These are the only two combinations.
//Example 2:
//
//Input: candidates = [2,3,5], target = 8
//Output: [[2,2,2,2],[2,3,3],[3,5]]

import java.util.ArrayList;
import java.util.List;

public class CombinationSum1 {

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        //ArrayList<Integer> ds = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
       findCombination(candidates,target,0,ans,new ArrayList<>());
       return ans;

    }
    public static void findCombination(int[] candidates, int target, int index, List<List<Integer>> ans, ArrayList<Integer> ds){
        if(candidates.length == index){
            if(target == 0){
                 ans.add(new ArrayList<>(ds));
            }
            return;
        }

        if(candidates[index] <= target){
            ds.add(candidates[index]);
            findCombination(candidates,target - candidates[index],index,ans,ds);
            ds.remove(ds.size() -1);
        }
        findCombination(candidates,target,index +1 ,ans,ds);

    }
    public static void main(String[] args){

        int[] candidates = {2,3,5};
    int target = 8;
         System.out.print(combinationSum(candidates, target));

    }
}
