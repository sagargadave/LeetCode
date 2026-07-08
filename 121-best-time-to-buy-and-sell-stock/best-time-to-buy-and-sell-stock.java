class Solution {
    public int maxProfit(int[] prices) {

        int profit = 0, n = prices.length, stock = prices[0];

        for (int i = 0; i < n; i++) {
            if (prices[i] < stock) {
                stock = prices[i];
            } else {
                profit = Math.max(prices[i] - stock, profit);
            }
        }

        return profit;
    }
}