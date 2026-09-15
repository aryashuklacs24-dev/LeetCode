class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
       List<List<Integer>> res = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();

        dfs(root, targetSum, temp, res);

        return res;
    }

    public void dfs(TreeNode root, int ts, ArrayList<Integer> temp,
                    List<List<Integer>> res) {

        if (root == null) {
            return;
        }

        temp.add(root.val);

        if (root.left == null && root.right == null) {
            if (ts == root.val) {
                res.add(new ArrayList<>(temp));
            }

            temp.remove(temp.size() - 1);
            return;
        }

        dfs(root.left, ts - root.val, temp, res);
        dfs(root.right, ts - root.val, temp, res);

        temp.remove(temp.size() - 1);
    }
}