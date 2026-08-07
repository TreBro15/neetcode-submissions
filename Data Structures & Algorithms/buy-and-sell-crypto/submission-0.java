class Solution {
    public int maxProfit(int[] prices) {
        int maxPri= 0;
        int minBuy = prices[0];
        for(int sell : prices){
            maxPri = Math.max(maxPri, sell - minBuy);
            minBuy = Math.min(minBuy, sell);
        }
        return maxPri;
    }
}
