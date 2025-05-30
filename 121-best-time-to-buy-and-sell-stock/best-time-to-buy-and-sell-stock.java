class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i]; // found a lower buying price
            } else if (prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice; // found a better profit
            }
        }

        return maxProfit;
    }
}
