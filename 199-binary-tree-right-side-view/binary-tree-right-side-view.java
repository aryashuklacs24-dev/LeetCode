class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        rightview(root, 0, ans);
        return ans;
    }

    int md = -1;

    public void rightview(TreeNode root, int cl, List<Integer> ans) {
        if (root == null) {
            return;
        }

        if (md < cl) {
            ans.add(root.val);
            md++;
        }

        rightview(root.right, cl + 1, ans);
        rightview(root.left, cl + 1, ans);
    }
}