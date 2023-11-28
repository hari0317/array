package Arrays.letco.Codepratice;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public static List<List<Integer>> subset(int[] nums){
        List<List<Integer>> ans = new ArrayList<>();
        findSubset(0,  ans,nums,new ArrayList());
        return  ans;
    }
    public static void findSubset(int index, List<List<Integer>> ans,int[] nums,ArrayList ds){

        ans.add(new ArrayList<>(ds));
        System.out.println(ans + "zsdxhdfjfghjkfhgmkkbj,bjh,  gvfhfgjf");
        for (int j = index; j < nums.length; j++){
            ds.add(nums[j]);
            findSubset(j + 1,ans,nums,ds);
            Object k = ds.remove(ds.size() - 1);
            System.out.println(k + "removed..............");

        }

    }
    public static void main(String[] args){
        int[] nums = {1,2,3};
        System.out.print(subset(nums));

    }
}
