public class reverselist {
    public ListNode reverseList(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode current = head;
        ListNode temp = current;
        ListNode next = current.next;
        current.next = null;
        while(next!= null){
            current = next;
            next = next.next;
            current.next = temp;
            temp = current;
        }
        return current;
    }   
}
