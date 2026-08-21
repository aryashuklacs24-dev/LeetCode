/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
 class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> path = new ArrayList<>();
        fun(root, "", path);
        return path;
    }

    public static void fun(TreeNode root, String ans, List<String> path) {
        if (root == null) {
            return;
        }
        ans = ans + root.val;

        if (root.left == null && root.right == null) {
            path.add(ans);
            return;
        }
        ans = ans + "->";

        fun(root.left, ans, path);
        fun(root.right, ans, path);
    }
}