class Solution {
    public int rob(int[] nums) {

        int n = nums.length;

        int[] dp = new int[n];

        Arrays.fill(dp, -1);

        return fun(nums, n - 1, dp);
    }

    public int fun(int[] nums, int i, int[] dp) {

        if (i == 0) {
            return nums[0];
        }

        if (i < 0) {
            return 0;
        }

        if (dp[i] != -1) {
            return dp[i];
        }

        int take = nums[i] + fun(nums, i - 2, dp);

        int notTake = fun(nums, i - 1, dp);

        dp[i] = Math.max(take, notTake);

        return dp[i];
    }
}