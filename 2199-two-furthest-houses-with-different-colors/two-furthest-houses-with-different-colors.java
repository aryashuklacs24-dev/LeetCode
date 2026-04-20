class Solution {
    public int maxDistance(int[] arr) {
        int n = arr.length;
        int maxDist = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] != arr[j]) {
                    maxDist = Math.max(maxDist, j - i);
                }
            }
        }

        return maxDist;
    }
}