class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);

        return fun(n, 0, dp);
    }

    public static int fun(int n, int sum, int[] dp) {

        if (sum == n) {
            return 1;
        }

        if (sum > n) {
            return 0;
        }

        if (dp[sum] != -1) {
            return dp[sum];
        }

        dp[sum] = fun(n, sum + 1, dp) + fun(n, sum + 2, dp);

        return dp[sum];
    }
}