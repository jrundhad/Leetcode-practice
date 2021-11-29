import java.util.*;

public class btreerightside {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        if(root == null){
            return list;
        }
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0 ; i<size; i++){
                TreeNode current = q.poll();
                if(i==size-1){
                    list.add(current.val);
                }
                if(current.left!=null){
                    q.add(current.left);
                }
                if(current.right!=null){
                    q.add(current.right);
                }
                
            }
        }
        return list;
    }

}
