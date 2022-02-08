public class maxPathSum {
    int max = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        dfs(root);
        return max;
    }

    public int dfs(TreeNode node){
        if(node==null){
            return 0;
        }
        int leftmax = Math.max(0, dfs(node.left));
        int rightmax = Math.max(0, dfs(node.right));
        max = Math.max(max, leftmax+rightmax+node.val);
        return Math.max(leftmax, rightmax)+ node.val;
    }
}
