import java.util.*;

public class mergeKlists {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode result = new ListNode();
        ListNode pointer = result;
        PriorityQueue<ListNode> heap = new PriorityQueue<ListNode>(
            (a,b) -> a.val - b.val
        );

        for(int i=0; i<lists.length; i++){
            if(lists[i]!=null) heap.add(lists[i]);
        }

        while(!heap.isEmpty()){
            pointer.next = heap.poll();
            pointer = pointer.next;
            if(pointer.next!=null){
                heap.add(pointer.next);
            }
        }

        return result.next;
    }
}

public class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
