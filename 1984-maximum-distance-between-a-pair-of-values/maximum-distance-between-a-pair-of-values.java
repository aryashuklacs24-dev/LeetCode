class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int l=0;
        int r=0;
        int diff=0;
        while(l<nums1.length && r<nums2.length){
            if(nums1[l]<=nums2[r]){
                diff=Math.max(diff,r-l);
                r++;
            }
            else{
                l++;
            }
        }
        return diff;
    }
}