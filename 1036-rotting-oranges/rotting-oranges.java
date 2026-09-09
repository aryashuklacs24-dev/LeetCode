import java.util.*;

class Solution {
    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int cntfresh = 0;

        Queue<int[]> q = new LinkedList<>();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (grid[i][j] == 2) {
                    q.offer(new int[]{i, j});
                }
                else if (grid[i][j] == 1) {
                    cntfresh++;
                }
            }
        }

        int min = 0;

        while (!q.isEmpty()) {
            int size = q.size();

            for (int p = 0; p < size; p++) {

                int[] curr = q.poll();

                int r = curr[0];
                int c = curr[1];

                int dir[][] = {
                    {1, 0},
                    {-1, 0},
                    {0, 1},
                    {0, -1}
                };

                for (int i = 0; i < 4; i++) {
                    int nr = r + dir[i][0];
                    int nc = c + dir[i][1];

                    if (nr >= 0 && nr < m &&
                        nc >= 0 && nc < n &&
                        grid[nr][nc] == 1) {

                        grid[nr][nc] = 2;
                        cntfresh--;

                        q.offer(new int[]{nr, nc});
                    }
                }
            }

            if (!q.isEmpty()) {
                min++;
            }
        }

        return cntfresh == 0 ? min : -1;
    }
}