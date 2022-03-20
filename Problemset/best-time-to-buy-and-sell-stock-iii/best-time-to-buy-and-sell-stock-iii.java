
988// @Title: 买卖股票的最佳时机 III (Best Time to Buy and Sell Stock III)
// @Author: 17816069684
// @Date: 2021-01-09 09:51:38
// @Runtime: 5 ms
// @Memory: 54.3 MB

class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int buy1 = -prices[0], sell1 = 0;
        int buy2 = -prices[0], sell2 = 0;
        for (int i = 1; i < n; ++i) {
            buy1 = Math.max(buy1, -prices[i]);
            sell1 = Math.max(sell1, buy1 + prices[i]);
            buy2 = Math.max(buy2, sell1 - prices[i]);
            sell2 = Math.max(sell2, buy2 + prices[i]);
        }
        return sell2;
    }
}

