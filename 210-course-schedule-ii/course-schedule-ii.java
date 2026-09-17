class Solution {

    public boolean dfs(int s, int[] visited,
                       ArrayList<ArrayList<Integer>> adj,
                       Stack<Integer> st) {

        visited[s] = 1;

        for (Integer nbr : adj.get(s)) {

            // Cycle found
            if (visited[nbr] == 1) {
                return true;
            }

            // Not visited
            if (visited[nbr] == 0) {
                if (dfs(nbr, visited, adj, st)) {
                    return true;
                }
            }
        }

        visited[s] = 2;
        st.push(s);

        return false;
    }

    public int[] findOrder(int numCourses, int[][] prerequisites) {

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] p : prerequisites) {
            int course = p[0];
            int prerequisite = p[1];

            adj.get(prerequisite).add(course);
        }

        int[] visited = new int[numCourses];

        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < numCourses; i++) {

            if (visited[i] == 0) {

                if (dfs(i, visited, adj, st)) {
                    return new int[0];
                }
            }
        }
        int[] ans = new int[numCourses];

        int i = 0;

        while (!st.isEmpty()) {
            ans[i] = st.pop();
            i++;
        }

        return ans;
    }
}