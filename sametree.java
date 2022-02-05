import java.util.*;

public class sametree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null){
            return true;
        }
        if((p!=null && q!=null && p.val != q.val) || (p!=null && q==null) || (q!=null && p==null)){
            return false;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
