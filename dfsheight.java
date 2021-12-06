public class dfsheight {
    int count = 0;
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        count = 1+ Math.max(maxDepth(root.left), maxDepth(root.right));
        return count;
    }

}
