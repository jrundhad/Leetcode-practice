public class dfsinvert {
    public TreeNode invertTree(TreeNode root) {
        if(root!=null){
            invertTree(root.left);
            invertTree(root.right);
            if(root.left!=null || root.right!= null){
                TreeNode temp = root.left;
                root.left = root.right;
                root.right = temp;
            }
        return root;
        } else {
            return null;
        }
    }
} 
