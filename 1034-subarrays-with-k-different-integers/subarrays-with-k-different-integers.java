class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atmostk(nums, k) - atmostk(nums, k - 1);
    }

    public int atmostk(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();

        int l = 0;
        int r = 0;
        int count = 0;

        while (r < nums.length) {

            map.put(nums[r], map.getOrDefault(nums[r], 0) + 1);
            r++;

            while (map.size() > k) {

                map.put(nums[l], map.get(nums[l]) - 1);

                if (map.get(nums[l]) == 0) {
                    map.remove(nums[l]);
                }

                l++;
            }

            count += r - l;
        }

        return count;
    }
}