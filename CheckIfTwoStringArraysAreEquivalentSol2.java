package Arrays.letco;

import com.sun.source.tree.ContinueTree;

public class CheckIfTwoStringArraysAreEquivalentSol2 {

    public static boolean solMethod(String[] word1, String[] word2){

        int word1length = word1.length;
        int word2length = word2.length;


        // length of Index 1 and 2
        int word1Index = 0;
        int word2Index = 0;

        int word1Char = 0;
        int word2Char = 0;

        //condition index should be less then word 1 and 2 length
        while(word1Index < word1length && word2Index < word2length){

            //checking each char for word1 and word2 are not equal

            if(word1[word1Index].charAt(word1Char) != word2[word2Index].charAt(word2Char)){

                return false;

                //if equal increament char++
            }else{
                word1Char++;
                word2Char++;

                //checking the length of char in string if so jumping to next string and making word1char = 0;
                if(word1Char == word1[word1Index].length()){
                    word1Index++;
                    word1Char = 0;
                }
                if(word2Char == word2[word2Index].length()){
                    word2Index++;
                    word2Char = 0;
                }

            }

        }
        //return whether both arrlength == indexlength
        return word1length == word1Index && word2length == word2Index;

    }

    public static void main(String[] args){
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};

        System.out.print(solMethod(word1,word2));


    }
}
