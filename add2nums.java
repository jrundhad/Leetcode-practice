public class add2nums {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode list = new ListNode();
        ListNode temp = list;
        int carry = 0;
        while(l1!=null && l2!=null){
            int sum = l1.val+l2.val+ carry;
            if(sum >=10){
                sum = sum - 10;
                carry = 1;
            } else {
                carry = 0;
            }
            ListNode node = new ListNode();
            node.val = sum;
            temp.next =  node;
            temp = temp.next;
            l1=l1.next;
            l2=l2.next;
        }

        while(l1!=null){
            int sum = l1.val+ carry;
            if(sum >=10){
                sum = sum - 10;
                carry = 1;
            } else {
                carry = 0;
            }
            ListNode node = new ListNode();
            node.val = sum;
            temp.next =  node;
            temp = temp.next;
            l1=l1.next;
        }

        while(l2!=null){
            int sum = l2.val+carry;
            if(sum >=10){
                sum = sum - 10;
                carry = 1;
            } else {
                carry = 0;
            }
            ListNode node = new ListNode();
            node.val = sum;
            temp.next =  node;
            temp = temp.next;
            l2=l2.next;
        }
        if(carry>0){
            ListNode node = new ListNode();
            node.val = carry;
            temp.next =  node;
            temp = temp.next;
            
        }
        return list.next;
    }
}
