class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null)
            return result;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int level = 1;
        while (!q.isEmpty()) {
            int size = q.size();
            LinkedList<Integer> curr = new LinkedList<>();

            while (size > 0) {

                TreeNode cur = q.poll();

                curr.add(cur.val);

                if (cur.left != null)
                    q.offer(cur.left);

                if (cur.right != null)
                    q.offer(cur.right);

                size--;
            }
            if(level%2==0){
                Collections.reverse(curr);
            }
            result.add(curr);
            level++;
        }

        return result;
    }
}