class Solution {
    public int[] searchRange(int[] nums, int target) {
        return search(nums, target); // return the result array
    }

    public static int[] search(int[] arr, int target) {
        int lo = 0;
        int hi = arr.length - 1;

        int first = -1;
        int last = -1;

        // Find FIRST occurrence
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (arr[mid] == target) {
                first = mid;
                hi = mid - 1;
            } else if (arr[mid] < target) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }

     
        lo = 0;
        hi = arr.length - 1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (arr[mid] == target) {
                last = mid;
                lo = mid + 1; 
            } else if (arr[mid] < target) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }

        return new int[]{first, last};
    }
}

