import javax.swing.text.AbstractDocument.LeafElement;

public class dfsmindepth {
    public int minDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        if(root.right!=null && root.left!=null){
            return 1 + Math.min(minDepth(root.left), minDepth(root.right));
        }
        if(root.left != null){
            return 1 + minDepth(root.left);
        }
        if(root.right != null){
            return 1 + minDepth(root.right);
        }
        return 1;
    }
}
