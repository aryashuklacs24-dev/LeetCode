class Solution {
    public int maxProfit(int[] prices) {
        int[][]dp=new int[prices.length][2];
        for(int[]row:dp){
            Arrays.fill(row,-1);
        }
        return solve(0,1,prices,dp);
        
    }
    public int solve(int i,int canbuy,int[]arr,int[][]dp){
        int n=arr.length;
        int profit;
        if(i==n){
            return 0;
        }
        if(dp[i][canbuy]!=-1){
            return dp[i][canbuy];
        }

        if(canbuy==1){
            int buy=solve(i+1,0,arr,dp)-arr[i];

            int skip=solve(i+1,1,arr,dp);

            profit=Math.max(buy,skip);
        }
        else{
            int sell=solve(i+1,1,arr,dp)+arr[i];

            int hold=solve(i+1,0,arr,dp);

            profit=Math.max(sell,hold);
        }

        dp[i][canbuy]=profit;
        return dp[i][canbuy];
    }
}