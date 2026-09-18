class Solution {
    public int uniquePathsIII(int[][] grid) {
        int empty=0;
        int cr=0;int cc=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]!=-1&&grid[i][j]!=1&&grid[i][j]!=2){
                    empty++;
                }
                if(grid[i][j]==1){
                    cr=i;
                    cc=j;
                }
            }
        }
       return  backtrack(grid,cr,cc,empty);

    }
    public int backtrack(int[][]grid,int cr,int cc,int empty){
        int cnt=0;
        int er=grid.length;
        int ec=grid[0].length;
        if(cr<0||cr>=er||cc<0||cc>=ec||grid[cr][cc]==-1){
            return 0;
        }

        if(grid[cr][cc]==2){
            if(empty==-1){
                return 1;
            }
            return 0;
        }

        grid[cr][cc]=-1;

        cnt+=backtrack(grid,cr+1,cc,empty-1);
        cnt+=backtrack(grid,cr,cc+1,empty-1);
        cnt+=backtrack(grid,cr-1,cc,empty-1);
        cnt+=backtrack(grid,cr,cc-1,empty-1);

        grid[cr][cc]=0;
        return cnt;


        
    }
}