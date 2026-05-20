class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit=0;
        int n =prices.length;
        int buyPrice=prices[0];
        for(int i=1;i<n;i++){
            int current=prices[i]- buyPrice;
            if(current>maxProfit)
                maxProfit=current;
            if(buyPrice>prices[i])
            buyPrice=prices[i];

        }
        return maxProfit;
    }
}
