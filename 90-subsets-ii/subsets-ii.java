class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
         List<List<Integer>> result = new ArrayList<>();
        ArrayList<Integer>temp=new ArrayList<>();
        Arrays.sort(nums);
        // int[]arr={1,2,3};
        fun(nums, 0, temp, result);
        return result;
    }
    public static void fun(int[]arr,int idx,List<Integer>temp,List<List<Integer>>res){
        // if(arr[idx]==arr[idx-1]){
        //     continue;
        // }
        // for(int i=idx;i<temp.size)
       
            res.add(new ArrayList<>(temp));
            
        for(int i=idx;i<arr.length;i++){
            if (i > idx && arr[i] == arr[i - 1]) continue;
            temp.add(arr[i]);
            fun(arr, i
                +1, temp, res);
                temp.remove(temp.size()-1);
        }
    }
}