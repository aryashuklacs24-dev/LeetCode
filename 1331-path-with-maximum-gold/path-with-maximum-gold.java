class Solution {
    public int getMaximumGold(int[][] grid) {
        int maxGold = 0;
        
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] != 0){
                    maxGold = Math.max(maxGold, dfs(grid, i, j));
                }
            }
        }
        return maxGold;
    }
    
    public int dfs(int[][] grid, int r, int c){
        if(r < 0 || c < 0 || r >= grid.length || c >= grid[0].length || grid[r][c] == 0){
            return 0;
        }
        
        int gold = grid[r][c];
        grid[r][c] = 0; 
        
        int up = dfs(grid, r-1, c);
        int down = dfs(grid, r+1, c);
        int left = dfs(grid, r, c-1);
        int right = dfs(grid, r, c+1);
        
        grid[r][c] = gold; 
        
        return gold + Math.max(Math.max(up, down), Math.max(left, right));
    }
}