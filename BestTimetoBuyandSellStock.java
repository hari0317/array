package Arrays.letco;

//Input: prices = [7,1,5,3,6,4]
//Output: 5
//Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
//Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
//Example 2:
//
//Input: prices = [7,6,4,3,1]
//Output: 0
//Explanation: In this case, no transactions are done and the max profit = 0.

// ONE-PASS APPROACH
// keep finding the lowest price possible is the key
// and difference between currentPrice and lowestPrice will give currentProfit
// we can compare currentProfit with the stored maxProfit
// return the maxProfit

public class BestTimetoBuyandSellStock {
    public static int maxProfit(int[] prices) {

        int minimumPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i = 0; i < prices.length; i++){
            //searching for minimum price
            if(prices[i] < minimumPrice){
                minimumPrice = prices[i];
            }

            maxProfit = Math.max(maxProfit,prices[i] - minimumPrice);
        }

        return maxProfit;

    }
    public static void main(String[] args){

        int[] prices = {7,6,4,3,1};

        System.out.println(maxProfit(prices));

    }
}
