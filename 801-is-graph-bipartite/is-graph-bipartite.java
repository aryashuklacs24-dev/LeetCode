class BIP {
    int vtx;
    int dist;

    public BIP(int vtx, int dist) {
        this.vtx = vtx;
        this.dist = dist;
    }
}

class Solution {
    public boolean isBipartite(int[][] graph) {
        Queue<BIP> q = new LinkedList<>();
        HashMap<Integer, Integer> visited = new HashMap<>();

        for (int i = 0; i < graph.length; i++) {
            if (visited.containsKey(i)) {
                continue;
            }

            q.add(new BIP(i, 0));

            while (!q.isEmpty()) {
                BIP curr = q.poll();

                int vtx = curr.vtx;
                int dist = curr.dist;

                if (visited.containsKey(vtx)) {
                    if (visited.get(vtx) % 2 != dist % 2) {
                        return false;
                    }
                    continue;
                }

                visited.put(vtx, dist);

                for (int nbr : graph[vtx]) {
                    q.add(new BIP(nbr, dist + 1));
                }
            }
        }

        return true;
    }
}