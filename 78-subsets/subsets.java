class Solution {
    public List<List<Integer>> subsets(int[] nums) {
         List<List<Integer>> result = new ArrayList<>();
        ArrayList<Integer>temp=new ArrayList<>();
        // int[]arr={1,2,3};
        fun(nums, 0, temp, result);
        return result;
        
    }
    public static void fun(int[]arr,int idx,List<Integer>temp,List<List<Integer>>res){
        
            res.add(new ArrayList<>(temp));
            
        for(int i=idx;i<arr.length;i++){
            temp.add(arr[i]);
            fun(arr, i
                +1, temp, res);
                temp.remove(temp.size()-1);
        }
    }
}