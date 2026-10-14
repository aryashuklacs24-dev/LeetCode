class Solution {
    public int minDistance(String s, String t) {
        int[][]dp=new int[s.length()][t.length()];
        for(int[]row:dp){
            Arrays.fill(row,-1);
        }
        return fun(s,t,0,0,dp);
        
    }
    public static int fun(String s1,String s2,int i,int j,int[][]dp){
        if(i==s1.length()){
            return s2.length()-j;
        }
        if(j==s2.length()){
            return s1.length()-i;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(s1.charAt(i)==s2.charAt(j)){
            return dp[i][j]=fun(s1,s2,i+1,j+1,dp);

        }

            int d=fun(s1,s2,i+1,j,dp);
            int I=fun(s1,s2,i,j+1,dp);
            int r=fun(s1,s2,i+1,j+1,dp);

            return dp[i][j]=1+Math.min(d,Math.min(I,r));
        
    }
}