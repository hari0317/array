package Arrays.letco;

import java.util.Arrays;

//Input: digits = [1,2,3]
//Output: [1,2,4]
//Explanation: The array represents the integer 123.
//Incrementing by one gives 123 + 1 = 124.
//Thus, the result should be [1,2,4].
//Example 2:
//
//Input: digits = [4,3,2,1]
//Output: [4,3,2,2]
//Explanation: The array represents the integer 4321.
//Incrementing by one gives 4321 + 1 = 4322.
//Thus, the result should be [4,3,2,2].

public class PlusOne {

    public static void main(String[] args){
        int[] digits = {2,9};

        int[] res = PlusOnee.plusonemethod(digits);

        System.out.println(Arrays.toString(res));



       System.out.print(Arrays.toString(digits));
    }
}
class PlusOnee{

    //
    static int[] plusonemethod(int[] digits){

        int counter = digits.length - 1;

        while(counter >= 0){
            // this will check != 9 if not will increase the value + 1
            if(digits[counter] != 9){
                digits[counter] += 1;

                return digits;

                //if digits[i] = 9 then make it as 0
            }else{
                digits[counter] = 0;
            }
            counter--;
        }

        //if the digit is 9 then take newarr = arr length + 1 and add arr[0] = 1
        //>> if 9 >> 10

        int[] newarr = new int[digits.length + 1];
        newarr[0] = 1;
        return newarr;

    }
}
