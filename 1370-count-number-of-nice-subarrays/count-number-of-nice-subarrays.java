class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
       
        return atmost(nums ,k)-atmost(nums,k-1);
    }
    public static int atmost(int []nums,int k){
        int l=0;
        int r=0;
        int presum=0;
        int cnt=0;
        if(k<0){
            return 0;
        }
        while(r<nums.length){
            presum+=(nums[r]%2);
            while(presum>k){
                presum-=(nums[l]%2);
                l++;
            }
            cnt=cnt+(r-l+1);
            r++;
        }
        return cnt;
        }
}