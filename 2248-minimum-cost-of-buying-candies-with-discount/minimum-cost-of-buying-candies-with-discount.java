class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int k = 0;
        int m = 0;

        for (int i = cost.length - 1; i >= 0; i--) {

            if (k != 2) {
                m += cost[i];
                k++;
            } else {
                k = 0;
            }
        }
        return m;
    }
}
