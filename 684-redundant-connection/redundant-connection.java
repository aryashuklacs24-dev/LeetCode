// Online Java Compiler (Editor)
// Write and run Java online using this editor.

class DSU {
    int[]parent;
    int []rank;
    DSU(int n){
        parent=new int[n];
        rank=new int[n];
        for(int i=0;i<n;i++){
            parent[i]=i;
            
        }
    }
    int find(int x){
        if(parent[x]==x){
            return x;
        }
        parent[x]=find(parent[x]);
        return parent[x];
    }
    boolean union(int a,int b){
        int rootA=find(a);
        int rootb=find(b);

        if(rootA==rootb){
            return false;
        }
        if(rank[rootA]<rank[rootb]){
            parent[rootA]=rootb;
        }
        else if (rank[rootA] > rank[rootb]) { 
            parent[rootb] = rootA;
        } 
        else { parent[rootb] = rootA;
               rank[rootA]++;
             }
        return true;
    
    }
    
}
class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        int n = edges.length;
        DSU dsu = new DSU(n + 1);

        for (int[] edge : edges) {
            int a = edge[0];
            int b = edge[1];

            if (!dsu.union(a, b)) {
                return edge;
            }
        }

        return new int[0];
    }
}