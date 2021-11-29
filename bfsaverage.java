import java.util.*;

public class bfsaverage {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list = new ArrayList<Double>();
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        while(!q.isEmpty()){
            Double count = 0.0;
            int size = q.size();
            for (int i = 0; i<size; i ++){
                TreeNode current = q.poll();
                count += current.val;
                if(current.left!=null){
                    q.add(current.left);
                }
                if(current.right != null){
                    q.add(current.right);
                }
            }
            list.add(count/size);

        }

        return list;
    }
}
