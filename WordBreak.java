package Arrays.letco;


//Dp Approach


import java.util.*;

//Example 2:
//
//Input: s = "applepenapple", wordDict = ["apple","pen"]
//Output: true
//Explanation: Return true because "applepenapple" can be segmented as "apple pen apple".
//Note that you are allowed to reuse a dictionary word.
//Example 3:
//
//Input: s = "catsandog", wordDict = ["cats","dog","sand","and","cat"]
//Output: false
public class WordBreak {

    static Set<String> dict ;

   static Map<String,Boolean> cache = new HashMap<>();
    public static boolean wordBreak(String s, List<String> wordDict){
        dict = new HashSet<>(wordDict);


        return helper(s);



    }

    public static boolean helper(String s){
        if(s == null || s.length() == 0) return true;
        if(cache.containsKey(s)){
            return cache.get(s);
        }
        for(int i = 1; i <= s.length(); i++){
            String left = s.substring(0,i);
            String right = s.substring(i,s.length());
            if(dict.contains(left) && helper(right) ){
                cache.put(s,true);
                return true;

            }
        }
        cache.put(s,false);
        return false;

    }

    public static void main(String[] args){

      //  String s = "applepenapple";
   //     List<String>  wordDict = new ArrayList<>(List.of("apple","pen"));

        String s = "catsandog";
        List<String>  wordDict = new ArrayList<>(List.of("cats","dog","sand","and","cat"));
        System.out.print(wordBreak(s, wordDict));
        System.out.print(cache);

    }
}
