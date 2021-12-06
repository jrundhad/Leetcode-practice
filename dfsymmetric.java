public class dfsymmetric {
    public boolean isSymmetric(TreeNode root) {
        return check(root.left,root.right);
    }

    public boolean check(TreeNode root , TreeNode root2){
        if(root==null && root2==null){
            return true;
        }
        if(root==null || root2==null){
            return false;
        }
        if(root.val==root2.val && (check(root.left, root2.right) && check(root.right, root2.left)))
            return true;
        return false;
    }

}
