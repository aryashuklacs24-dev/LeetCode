class Solution {
    // int count=0;
    public int findTargetSumWays(int[] nums, int target) {
        int count=fun(nums,target,0,0);
        return count;
    }
    public static int fun(int[]nums,int t,int s,int idx){
        int count=0;
        if (idx == nums.length) {
            if (s == t) {
                // count++;  
                return 1;
            }
            return 0;
        }

        count+=fun(nums,t,s+nums[idx],idx+1);
        count+=fun(nums,t,s-nums[idx],idx+1);
        return count;
    }
}