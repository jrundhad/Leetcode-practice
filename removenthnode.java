public class removenthnode {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode front = new ListNode();
        front.next= head;
        
        ListNode slow = front;
        ListNode fast = front;
        
        for(int i=0; i< n+1; i++){
            fast = fast.next;
        }
        
        while(fast!=null){
            fast =fast.next;
            slow = slow.next;
        }
        
        slow.next = slow.next.next;
        return front.next;
    }
}
