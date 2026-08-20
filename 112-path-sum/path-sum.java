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
    public boolean hasPathSum(TreeNode root, int targetSum) { 
        return sum(root,targetSum);
    }
    public static boolean sum(TreeNode root,int t){
        // int t=targetSum;
        if(root==null){
            return false;
        }
        t-=root.val;
        if(root.left==null &&root.right ==null){
        if(t==0){
            return true;
        }
    }
        if(sum(root.left,t)){
            return true;
        }
        if(sum(root.right,t)){
            return true;
        }

        return false;
    }
}