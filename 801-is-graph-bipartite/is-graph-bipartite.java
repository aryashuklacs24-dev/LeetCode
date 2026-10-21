class Solution {
public boolean isBipartite(int[][] graph) {
int[] color = new int[graph.length];
Arrays.fill(color, -1);

    for (int i = 0; i < graph.length; i++) {
        if (color[i] == -1) {
            Queue<Integer> q = new LinkedList<>();
            q.offer(i);
            color[i] = 0;

            while (!q.isEmpty()) {
                int curr = q.poll();

                for (int nbr : graph[curr]) {
                    if (color[nbr] == -1) {
                        color[nbr] = 1 - color[curr];
                        q.offer(nbr);
                    } else if (color[nbr] == color[curr]) {
                        return false;
                    }
                }
            }
        }
    }

    return true;
}
}
