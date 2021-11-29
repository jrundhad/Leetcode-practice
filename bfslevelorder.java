import java.util.*;
public class bfslevelorder {


    public static void main(String[] args){
       // System.out.println(levelOrder("car","rac"));
    }
    
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> pq = new LinkedList<TreeNode>();
        pq.add(root);
        List<List<Integer>> list = new ArrayList<List<Integer>>(); 
        while(!pq.isEmpty()){
            List<Integer> list2 = new ArrayList<Integer>();
            int size = pq.size();            
            for (int i=0;i<size;i++){
                TreeNode current = pq.poll();
                if(current != null){
                    list2.add(current.val);
                    pq.add(current.left);
                    pq.add(current.right);
                }
            }
            if(list2.size()>=1)
                list.add(list2);
        }
            
        
        return list;

    }
}

