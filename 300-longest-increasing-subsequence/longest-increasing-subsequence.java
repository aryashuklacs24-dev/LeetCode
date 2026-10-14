class Solution {
public int lengthOfLIS(int[] nums) {
int[] lis = new int[nums.length];

    lis[0] = nums[0];
    int len = 1;

    for (int i = 1; i < nums.length; i++) {
        if (nums[i] > lis[len - 1]) {
            lis[len] = nums[i];
            len++;
        } else {
            int idx = binarySearch(lis, 0, len - 1, nums[i]);
            lis[idx] = nums[i];
        }
    }

    return len;
}

public int binarySearch(int[] lis, int low, int high, int target) {
    while (low <= high) {
        int mid = low + (high - low) / 2;

        if (lis[mid] == target) {
            return mid;
        } else if (lis[mid] > target) {
            high = mid - 1;
        } else {
            low = mid + 1;
        }
    }

    return low;
}

}
