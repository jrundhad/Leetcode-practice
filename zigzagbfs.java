import java.util.*;

public class zigzagbfs {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        Queue<TreeNode> q = new LinkedList<TreeNode>();

        if(root==null) {
            return list;
        }
        
        q.add(root);
        int direction = 1;
        while(!q.isEmpty()){
            List<Integer> list2 = new ArrayList<Integer>();
            int size = q.size();
            for(int i=0; i<size;i++){
                TreeNode current =  q.poll();
                if(direction == 1){
                    list2.add(current.val);
                }
                else list2.add(0,current.val);

                if(current.left !=null){
                    q.add(current.left);
                }
                if(current.right !=null){
                    q.add(current.right);
                }
                
            }
            list.add(list2);
            if(direction == 1){ 
                direction = 0;
            }
            else {
                direction = 1;
            }
            
        }
        return list;
    }
}
