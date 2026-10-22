class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
       List<List<Integer>>ans=new ArrayList<>();
       List<Integer>temp=new ArrayList<>();
       fun(0,graph.length-1,graph,ans,temp);
       return ans;

    }
    public static void fun(int src,int dest,int[][]graph,List<List<Integer>>ans,List<Integer>temp){
        temp.add(src);

        if(src==dest){
            ans.add(new ArrayList<>(temp));
            temp.remove(temp.size()-1);
            return;
        }

        for(int nbr:graph[src]){
            fun(nbr,dest,graph,ans,temp);
        }
        temp.remove(temp.size()-1);
    }
}