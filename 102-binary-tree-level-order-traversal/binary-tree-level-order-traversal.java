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

        HashMap<Integer, List<Integer>> map = new HashMap<>();

        inorder(root, 0, map);

        List<List<Integer>> ans = new ArrayList<>();

        int level = 0;

        while (map.containsKey(level)) {
            ans.add(map.get(level));
            level++;
        }

        return ans;
    }

    public static void inorder(TreeNode root, int level,HashMap<Integer, List<Integer>> map) {

        if (root == null) {
            return;
        }
        inorder(root.left, level + 1, map);

        if (!map.containsKey(level)) {
            map.put(level, new ArrayList<>());
        }
        map.get(level).add(root.val);

        inorder(root.right, level + 1, map);
    }
}