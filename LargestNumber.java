package Arrays.letco;

//Example 1:
//
//Input: nums = [10,2]
//Output: "210"
//Example 2:
//
//Input: nums = [3,30,34,5,9]
//Output: "9534330"

  

import java.util.Arrays;

public class LargestNumber {
    public static String largestNumber(int[] nums) {

        String[] str = Arrays.stream(nums).mapToObj(Integer::toString).toArray(String[]::new);

        //sort array based on greater value when combining (i + j)  (j + i) using comparator
        Arrays.sort(str,(a,b)->(b+a).compareTo(a+b));




        StringBuilder sb=new StringBuilder();


        for(String s:str)
        {
            sb.append(s);
        }

        String result=sb.toString();

        return result.startsWith("0")?"0":result;

    }
    public static void main(String[] args){

        int[] nums = {10,2};
        System.out.print( largestNumber( nums));



    }
}
