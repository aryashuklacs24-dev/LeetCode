import java.util.Arrays;

class Solution {

    public int maxProfit(int[] prices) {
        int n = prices.length;

        int[][][] dp = new int[n][2][2];

        for (int[][] arr : dp) {
            for (int[] row : arr) {
                Arrays.fill(row, -1);
            }
        }

        return solve(0, 0, 1, prices, dp);
    }

    public int solve(int i, int buy, int cap,
                     int[] prices, int[][][] dp) {

        if (i == prices.length || cap == 0) {
            return 0;
        }

        if (dp[i][buy][cap] != -1) {
            return dp[i][buy][cap];
        }

        int profit;

        if (buy == 0) {

            int take = -prices[i] + solve(i + 1, 1, cap, prices, dp);

            int notTake = solve(i + 1, 0, cap, prices, dp);

            profit = Math.max(take, notTake);

        } else {

            int sell = prices[i] + solve(i + 1, 0, cap - 1, prices, dp);

            int notSell = solve(i + 1, 1, cap, prices, dp);

            profit = Math.max(sell, notSell);
        }

        return dp[i][buy][cap] = profit;
    }
}