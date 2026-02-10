class Solution {

    public boolean canBeIncreasing(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int[] temp = new int[n - 1];
            int idx = 0;
            
            for (int j = 0; j < n; j++) {
                if (j != i) {
                    temp[idx++] = nums[j];
                }
            }

            if (isIncreasing(temp)) {
                return true;
            }
        }
        return false;
    }

    private boolean isIncreasing(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] <= arr[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
