class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>>ans =new ArrayList<>();
        backtrack(1,n,k,new ArrayList<>(),ans);
        return ans;
    }
    public static void backtrack(int idx,int n,int k,List<Integer> temp, 
                                List<List<Integer>> ans){
        if(temp.size()==k){
            ans.add(new ArrayList<>(temp));
            return;
        }

        for(int i=idx;i<=n;i++){
            temp.add(i);
            backtrack(i+1,n,k,temp,ans);
            temp.remove(temp.size()-1);
        }
        // return ans;
    }
}