class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int low=0;
        int high=1;
        int profit=0;
        while(high<n){
            if(prices[low]<prices[high]){
                profit=Math.max(profit,prices[high]-prices[low]);
            }
            else
                low=high;
            high++;
        }
        return profit;
    }
}