class Solution {
    public boolean exist(char[][] board, String word) {
        int n=board.length;
        int m=board[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(dfs(board,word,i,j,0)){
                    return true;
                }
            }
        }
        return false;
    }
   
    public static boolean dfs(char[][]board,String word,int r,int c,int idx){
        int n=board.length;
        int m=board[0].length;
        if(idx==word.length()){
            return true;
        }
        if(r<0||r>=n||c<0||c>=m||board[r][c]!=word.charAt(idx)){
            return false;
        }
        char ch=board[r][c];
        board[r][c]= '#';
boolean found=
        dfs(board,word,r+1,c,idx+1)||
        dfs(board,word,r-1,c,idx+1)||
        dfs(board,word,r,c+1,idx+1)||
        dfs(board,word,r,c-1,idx+1);

        board[r][c]=ch;
        return found;
    }
}