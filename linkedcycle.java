import java.util.*;

public class linkedcycle {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> set = new HashSet<ListNode>();
        while(head!=null){
            if(!set.contains(head)){
                set.add(head);
                head= head.next;
            }else{
                return true;
            }
        }
        return false;
    }
}
