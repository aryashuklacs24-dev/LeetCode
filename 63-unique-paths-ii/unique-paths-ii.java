class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n = obstacleGrid.length;
        int m = obstacleGrid[0].length;
        int[][] dp = new int[n][m];
        for(int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }

        return backtrack(obstacleGrid, 0, 0, dp);
    }

    public int backtrack(int[][] grid, int cr, int cc, int[][] dp) {

        int er = grid.length;
        int ec = grid[0].length;
        if(cr >= er || cc >= ec || grid[cr][cc] == 1) {
            return 0;
        }
        if(cr == er - 1 && cc == ec - 1) {
            return 1;
        }
        if(dp[cr][cc] != -1) {
            return dp[cr][cc];
        }

        int cnt = 0;
        cnt += backtrack(grid, cr + 1, cc, dp);
        cnt += backtrack(grid, cr, cc + 1, dp);

        dp[cr][cc] = cnt;

        return cnt;
    }
}