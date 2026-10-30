import java.util.*;

class Solution {
public int maxProfit(int[] prices) {

    int n = prices.length;

    int[][][] dp = new int[n][2][3];

    for (int index = 0; index < n; index++) {
        for (int canBuy = 0; canBuy < 2; canBuy++) {
            Arrays.fill(dp[index][canBuy], -1);
        }
    }

    return solve(0, 1, 2, prices, dp);
}

public int solve(int day, int canBuy, int remaining,
                 int[] arr, int[][][] dp) {

    if (day == arr.length || remaining == 0) {
        return 0;
    }

    if (dp[day][canBuy][remaining] != -1) {
        return dp[day][canBuy][remaining];
    }

    int profit;

    if (canBuy == 1) {
        int buy = -arr[day] +
                  solve(day + 1, 0, remaining, arr, dp);

        int skip = solve(day + 1, 1, remaining, arr, dp);

        profit = Math.max(buy, skip);
    }
    else {
        int sell = arr[day] +
                   solve(day + 1, 1, remaining - 1, arr, dp);

        int hold = solve(day + 1, 0, remaining, arr, dp);

        profit = Math.max(sell, hold);
    }

    return dp[day][canBuy][remaining] = profit;
}
}
