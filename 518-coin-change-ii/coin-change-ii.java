import java.util.Arrays;

class Solution {
    public int change(int amount, int[] coins) {
        int[][] dp = new int[amount + 1][coins.length];

        for (int i = 0; i <= amount; i++) {
            Arrays.fill(dp[i], -1);
        }

        return fun(amount, coins, 0, dp);
    }

    public int fun(int amount, int[] coins, int i, int[][] dp) {
        if (amount == 0) return 1;
        if (amount < 0 || i == coins.length) return 0;

        if (dp[amount][i] != -1) {
            return dp[amount][i];
        }

        int take = fun(amount - coins[i], coins, i, dp);
        int notTake = fun(amount, coins, i + 1, dp);

        return dp[amount][i] = take + notTake;
    }
}