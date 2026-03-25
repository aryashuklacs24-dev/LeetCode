class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        long ts=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                ts+=grid[i][j];
            }
        }
        if(ts%2!=0){
            return false;
        }
        long rs=0;
        for(int i=0;i<n-1;i++){
            // int rowsum=0;
            for(int j=0;j<m;j++){
                rs+=grid[i][j];
            }
            if(rs==ts/2){
                return true;
            }
        }
        long cs=0;
        for(int i=0;i<m-1;i++){
            // int colsum=0;
            for(int j=0;j<n;j++){
                cs+=grid[j][i];
            }
             if(cs==ts/2){
            return true;
        }
        }
       
        return false;
    }
}