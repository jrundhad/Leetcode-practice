public class oddevenList {
    public ListNode oddEvenList(ListNode head) {
        if(head==null){
            return null;
        }

        ListNode oddlist = head;
        ListNode evenList = head.next;
        ListNode a = oddlist;
        ListNode b = evenList;

        while(a!=null && b!=null){
            if(b!= null){
                a.next = b.next;
            }
            if(b.next!=null){
                b.next = b.next.next;
            }
            a=a.next;
            b=b.next;
        }

        a = oddlist;
        while(a.next!=null){
            a= a.next;
        }
        a.next= evenList;
        return oddlist;

    }   
}
