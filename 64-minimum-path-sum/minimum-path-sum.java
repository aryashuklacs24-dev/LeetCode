class Solution {
    public int minPathSum(int[][] grid) {
        int[][]dp=new int[grid.length][grid[0].length];
        for(int[]row:dp){
            Arrays.fill(row,-1);
        }
        return fun(grid,0,0,dp);


    }

    public static int fun(int[][]arr,int i,int j,int[][]dp){
        if(i==arr.length-1&&j==arr[0].length-1){
            return arr[i][j];
        }
        if(i>=arr.length || j>=arr[0].length){
            return Integer.MAX_VALUE;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }

        int r=fun(arr,i,j+1,dp);
        int d=fun(arr,i+1,j,dp);
        return dp[i][j]=arr[i][j]+Math.min(r,d);

    }
}