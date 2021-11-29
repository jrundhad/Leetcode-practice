import java.util.*;

public class bfslargestVal {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        while(!q.isEmpty()){
            int count = Integer.MIN_VALUE; 
            int size = q.size();
            for(int i = 0; i<size; i++){
                TreeNode current =  q.poll();
                if(current!=null){
                    if(current.val > count){
                        count = current.val;
                    }
                    if(current.left != null){
                        q.add(current.left);
                    }
                    if (current.right != null){
                        q.add(current.right);
                    }
                    
                }
    
            }
            
            list.add(count);

        }
        return list;
    }
}
