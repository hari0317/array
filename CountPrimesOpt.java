package Arrays.letco;

//Algorithm of Sieve of Eratosthenes

/*
input: an int n > 1.
output: Each prime numbers from 2 to n.
Let A be an array of Boolean values, indexed by integers 2 to n.
initially all set to true.
for i = 2, 3, 4, ..., not exceeding ? n do.
if A[i] is true.
for j = i2, i2+i, i2+2i, i2+3i, ..., not exceeding n do.
A[j]: = false.
 */

import java.util.Arrays;

public class CountPrimesOpt {
    public static void main(String[] args)
    {
        int n = 499979;

        //creating boolean array using n
       boolean[] pre = new boolean[n];

       //fill whole array as true
        Arrays.fill(pre,true);


        //loop and check if its prime
        for(int i = 2; i < Math.sqrt(n); i++){
            //check if true
            if(pre[i]){
                //loop the array and put pre[i] divisible value as false
                for(int j = i*i ; j < n ; j = i + j){
                    System.out.println(j + "================================================");
                    pre[j] = false;
                }
            }
        }


        System.out.println(Arrays.toString(pre));

        int counter = 0;
        for (int i = 2; i < n; i++){
            if(pre[i]){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
