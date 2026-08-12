
    class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        
        HashMap<Integer, Integer> freq = new HashMap<>();
        
        int l = 0;
        int r = 0;
        int max = 0;
        
        while (r < nums.length) {
            
            freq.put(nums[r], freq.getOrDefault(nums[r], 0) + 1);
            
            while (freq.get(nums[r]) > k) {
                freq.put(nums[l], freq.get(nums[l]) - 1);
                l++;
            }
            
            max = Math.max(max, r - l + 1);
            
            r++;
        }
        
        return max;
    }

}