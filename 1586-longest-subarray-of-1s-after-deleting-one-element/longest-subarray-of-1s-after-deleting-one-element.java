class Solution {
    public int longestSubarray(int[] nums) {
        
        int k=1;
         int n=nums.length;
        int l=0;
        int r=0;
        int maxlen=0;
        int z=0;
        while(r<n){
            if(nums[r]==0){
                z++;
            }
            while(z>k){
                if(nums[l]==0){
                    z--;
                }
                    l++;
            }
            int len=r-l;
            maxlen=Math.max(maxlen,len);
            r++;
        }
        return maxlen;
    }
}