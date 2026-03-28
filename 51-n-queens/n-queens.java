import java.util.*;

class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        
        char[][] board = new char[n][n];
        for (char[] row : board) {
            Arrays.fill(row, '.');
        }

        fun(board, 0, res);
        return res;
    }

    public static void fun(char[][] board, int row, List<List<String>> res) {
        if (row == board.length) {
            res.add(construct(board));
            return;
        }

        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 'Q';
                fun(board, row + 1, res);
                board[row][col] = '.'; 
            }
        }
    }

    public static boolean isSafe(char[][] board, int row, int col) {
        int r = row;

        
        while (r >= 0) {
            if (board[r][col] == 'Q') return false;
            r--;
        }

        r = row;
        int c = col;
        while (r >= 0 && c >= 0) {
            if (board[r][c] == 'Q') return false;
            r--;
            c--;
        }

        r = row;
        c = col;
        while (r >= 0 && c < board.length) {
            if (board[r][c] == 'Q') return false;
            r--;
            c++;
        }

        return true;
    }

    public static List<String> construct(char[][] board) {
        List<String> ans = new ArrayList<>();
        for (char[] row : board) {
            ans.add(new String(row));
        }
        return ans;
    }
}