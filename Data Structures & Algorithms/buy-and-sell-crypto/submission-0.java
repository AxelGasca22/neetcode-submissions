class Solution {
    public int maxProfit(int[] prices) {
        int minValue=0;
        int maxValue=0;
        int sell = 0;

        for(int i = 0; i < prices.length; i++){
            for(int j = i+1; j < prices.length; j++){
                if(prices[i] < prices[j]){
                    sell = prices[j] - prices[i];
                    if(sell > maxValue){
                        maxValue = sell;
                    }
                }

            }
        }

        return maxValue;
    }
}
