class Solution {
    public int minMoves(int[] nums) {
        int max=nums[0];

        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
        }

        int m=0;

        for(int i=0;i<nums.length;i++){
            m+=max-nums[i];
        }

        return m;
    }
}