class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
          List<List<Integer>> result = new ArrayList<>();
          Arrays.sort(candidates);
        fun(candidates,target,0,new ArrayList<>(),result);
        return result;
        
    }
    public static void fun(int[]arr,int amt,int idx,List<Integer>temp,List<List<Integer>>res){
        if(amt==0){
           res.add(new ArrayList<>(temp));
            return;
        }
        for(int i=idx;i<arr.length;i++){
            if(i>idx&&arr[i]==arr[i-1]){
                continue;
            }
            if(amt>=arr[i]){
                temp.add(arr[i]);
                fun(arr,amt-arr[i],i+1,temp,res);
                temp.remove(temp.size()-1);
            }
        }
    }
}