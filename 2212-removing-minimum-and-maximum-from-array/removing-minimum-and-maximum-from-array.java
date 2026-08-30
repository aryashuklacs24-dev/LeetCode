class Solution {
    public int minimumDeletions(int[] nums) {
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        int minIdx = 0;
        int maxIdx = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
                minIdx = i;
            }

            if (nums[i] > max) {
                max = nums[i];
                maxIdx = i;
            }
        }

        int n = nums.length;

        int left = Math.min(minIdx, maxIdx);
        int right = Math.max(minIdx, maxIdx);

        int front = right + 1;
        int back = n - left;
        int bothSides = (left + 1) + (n - right);

        return Math.min(front, Math.min(back, bothSides));
    }
}