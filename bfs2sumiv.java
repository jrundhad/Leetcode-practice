import java.util.*;
public class bfs2sumiv {
    public boolean findTarget(TreeNode root, int k) {
        Queue<TreeNode> q = new LinkedList();
        HashSet<Integer> set = new HashSet();
        q.add(root);
        
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0; i<size; i++){
                TreeNode n = q.poll();
                int val = k - n.val;
                if(set.contains(val)){
                    return true;
                }
                set.add(n.val);
                if(n.left!= null) q.add(n.left);
                if(n.right != null) q.add(n.right);
            }
        }
        
        return false;
    }
}
