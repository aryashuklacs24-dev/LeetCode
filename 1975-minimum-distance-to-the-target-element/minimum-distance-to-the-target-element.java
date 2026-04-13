class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int diff=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                diff=Math.abs(i-start);
                if(diff<min){
                    min=diff;
                }
            }
        }
        return min;
    }
}