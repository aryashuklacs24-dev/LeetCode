import java.util.*;

class Solution {
    int count = 0;

    public int totalNQueens(int n) {
        char[][] board = new char[n][n];
        for (char[] row : board) {
            Arrays.fill(row, '.');
        }

        fun(board, 0);
        return count;
    }

    public void fun(char[][] board, int row) {
        if (row == board.length) {
            count++;
            return;
        }

        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 'Q';
                fun(board, row + 1);
                board[row][col] = '.';
            }
        }
    }

    public boolean isSafe(char[][] board, int row, int col) {
        int r = row;

        // column check
        while (r >= 0) {
            if (board[r][col] == 'Q') return false;
            r--;
        }

        // left diagonal
        r = row;
        int c = col;
        while (r >= 0 && c >= 0) {
            if (board[r][c] == 'Q') return false;
            r--;
            c--;
        }

        // right diagonal
        r = row;
        c = col;
        while (r >= 0 && c < board.length) {
            if (board[r][c] == 'Q') return false;
            r--;
            c++;
        }

        return true;
    }
}