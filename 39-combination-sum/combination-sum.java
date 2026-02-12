class Solution {

    public List<List<Integer>> combinationSum(int[] coin, int amt) {

        List<List<Integer>> result = new ArrayList<>();
        fun(coin, amt, 0, new ArrayList<>(), result);
        return result;
    }

    public void fun(int[] coin, int amt, int idx,
                    List<Integer> temp,
                    List<List<Integer>> result) {

        if (amt == 0) {
            result.add(new ArrayList<>(temp));
            return;
        }

        for (int i = idx; i < coin.length; i++) {
            if (amt >= coin[i]) {

                temp.add(coin[i]);                 
                fun(coin, amt - coin[i], i, temp, result); 
                temp.remove(temp.size() - 1);     
            }
        }
    }
}