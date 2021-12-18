import java.util.*;

public class linkedcycle {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> set = new HashSet<ListNode>();
        set.add(head);
        while(head!=null){
            if(!set.contains(head.next)){
                set.add(head.next);
                head= head.next;
            }else{
                return true;
            }
        }
        return false;
    }
}
