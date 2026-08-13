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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();

        if (root == null) return res;

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        q.offer(null);

        List<Integer> curr = new ArrayList<>();

        while (!q.isEmpty()) {

            TreeNode current = q.poll();

            if (current == null) {
                res.add(curr);
                curr = new ArrayList<>();

                if (!q.isEmpty()) {
                    q.offer(null);
                }
            } 
            else {
                curr.add(current.val);

                if (current.left != null) {
                    q.offer(current.left);
                }

                if (current.right != null) {
                    q.offer(current.right);
                }
            }
        }

        return res;
    }
}