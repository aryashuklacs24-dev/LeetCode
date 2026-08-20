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
        List<Integer>path=new ArrayList<>();
        return sum(root,targetSum,path);
    }
    public static boolean sum(TreeNode root,int targetSum,List<Integer>path){
        int t=targetSum;
        if(root==null){
            return false;
        }

        t-=root.val;
        path.add(root.val);

        if(root.left==null &&root.right ==null){
        if(t==0){
            return true;
        }
    }
        if(sum(root.left,t,path)){
            return true;
        }
        if(sum(root.right,t,path)){
            return true;
        }

        // t+=path.size(-1);
        path.remove(path.size()-1);
        return false;
    }
}