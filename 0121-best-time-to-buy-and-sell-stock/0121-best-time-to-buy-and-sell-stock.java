class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit = 0;
        int min = prices[0];

        int l = prices.length;

        for(int i = 0 ; i < l ; i++){
            if( prices[i] < min)
            {
                min = prices[i];
            }
            else{
            int profit = prices[i] - min ;
            if(profit > maxprofit)
            {
                maxprofit = profit;
                
            }
            }
        }
      
        return maxprofit;
    }
}