class Solution {
    public int longestCommonSubsequence(String s1, String s2) {
        int[][]dp=new int[s1.length()][s2.length()];
        // int ans=0;
        for (int[] row : dp) {
    Arrays.fill(row, -1);
}
        return lcstd(s1,s2,0,0,dp);
        // return ans;
    }
    public static int lcstd(String s1,String s2,int i,int j,int[][]dp){
        if(i==s1.length()||j==s2.length()){
            return 0;
        }

        if(dp[i][j]!=-1){
            return dp[i][j];
        }

        if(s1.charAt(i)==s2.charAt(j)){
            dp[i][j]= 1+lcstd(s1,s2,i+1,j+1,dp);
        }
        else{
            int f=lcstd(s1,s2,i+1,j,dp);
            int s=lcstd(s1,s2,i,j+1,dp);
            dp[i][j]=Math.max(f,s);
        }

        return dp[i][j];
    }
}