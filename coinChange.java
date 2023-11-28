package Arrays.letco.Codepratice;
public class coinChange {

    public static int coinChange(int[] coins, int amount){

        //edge case
        if(amount == 0){
            return 0;
        }

        //memo
        Integer[] memo = new Integer[amount + 1];

        memo[0] = 0;



        for(int i =1 ; i <= amount; i++){

           //Intilizing as MAX__VALUE
            memo[i] = Integer.MAX_VALUE;

            for(int coin : coins){

                //checking 2 case 1]-->coin is less then / == to arr[i]
                //2]--> checking whether we have remaining coin available in previous denomination.
                // if value is MAX__VALUE exist
                if(coin <= i && memo[i - coin] != Integer.MAX_VALUE ){


                    //taking min value between memo[i] , memo[target - coin_we_have] + 1
                    // {will take memo[target - coin_we_have] value which is already stored in memo array}
                    memo[i] = Integer.min(memo[i],memo[i - coin] + 1);
                }
            }



        }
        if(memo[amount] == Integer.MAX_VALUE){
            return  -1;
        }
        return memo[amount];

    }

    public static void main(String[] args){

        int[] coins = {4};
        int amount = 7;

        System.out.print(coinChange(coins, amount));



    }
}
