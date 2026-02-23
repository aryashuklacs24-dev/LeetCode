class Solution {
    public int maximumSum(int[] nums) {
        int[] best = new int[82];   
        int maxSum = -1;

        for (int num : nums) {
            int sum = digitSum(num);

            if (best[sum] != 0) {   
                maxSum = Math.max(maxSum, best[sum] + num);
                best[sum] = Math.max(best[sum], num);
            } else {
                best[sum] = num;
            }
        }
        return maxSum;
    }

    private int digitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}