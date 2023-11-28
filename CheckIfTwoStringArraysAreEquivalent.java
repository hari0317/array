package Arrays.letco;

public class CheckIfTwoStringArraysAreEquivalent {
    static String convertString(String[] str){
        StringBuilder stringBuilder = new StringBuilder();
        for(String s : str){
            stringBuilder.append(s);

        }

        return stringBuilder.toString();
    }

    static  boolean arrayStringsAreEqual(String[] word1, String[] word2){
        String str1 = convertString(word1);
        String str2 = convertString(word2);

        if(str1.equals(str2)){
            return true;
        }else{
            return false;
        }
    }


    public static void main(String[]  args){
       // Input: word1 = ["ab", "c"], word2 = ["a", "bc"]
       // Output: true


        String[] word1 = {"abc", "d", "defg"};
        String[] word2 = {"abcddefg"};




        System.out.println( arrayStringsAreEqual(word1,word2));


    }
}
