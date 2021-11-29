import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import apple.laf.JRSUIUtils.Tree;

public class bfstrav2 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        if (root==null){
            return list;
        }
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> list2 = new ArrayList<Integer>(); 
            for(int i=0;i<size; i++){
                TreeNode current = q.poll();
                list2.add(current.val);
                if(current.left!= null){
                    q.add(current.left);
                }
                if(current.right!=null){
                    q.add(current.right);
                }
            }
            list.add(list2);
        }
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for(int i = list.size()-1;i>=0;i--){
            result.add(list.get(i));
        }
        return result;

    }
}
