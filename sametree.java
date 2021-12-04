import java.util.*;

public class sametree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return traversal(p, q);
    }

    public boolean traversal(TreeNode root, TreeNode root2){
        boolean x= true;
        boolean y= true;
        if(root!=null && root2!=null && root2.val==root.val){
            x = traversal(root.left, root2.left);
            y = traversal(root.right, root2.right);    
        }
        else if (root!=root2){
            return false;
        }
        if(x==y && x==true){
                return x;
            }else{
                return false;
            } 
    }
}
