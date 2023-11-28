package Arrays.letco;

//Input: n = 3
//Output: 3
//Explanation: There are three ways to climb to the top.
//1. 1 step + 1 step + 1 step
//2. 1 step + 2 steps
//3. 2 steps + 1 step

// First DP problem
// best resources: https://www.youtube.com/watch?v=vYquumk4nWw
// https://www.youtube.com/watch?v=Y0lT9Fck7qI

public class ClimbingStairs {

    public static int climbStairs(int n){
        int curr = 0;
        int prev1= 2;
        int prev2 = 1;
        if(n == 1){
            return 1;

        }

        if(n ==2){
            return 2;
        }
        for(int i = 3; i <=n ; i++){

            curr = prev1 + prev2;
            prev2 = prev1;
            prev1 = curr;

        }
        return curr;
     }

    public static void main(String[] args){
        int n = 5;
        System.out.print(climbStairs(n));

    }
}
