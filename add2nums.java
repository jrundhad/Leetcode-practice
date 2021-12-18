public class add2nums {
    public listnode addTwoNumbers(listnode l1, listnode l2) {
        listnode list = new listnode();
        listnode temp = list;
        int carry = 0;
        while(l1!=null && l2!=null){
            int sum = l1.val+l2.val+ carry;
            if(sum >=10){
                sum = sum - 10;
                carry = 1;
            } else {
                carry = 0;
            }
            listnode node = new listnode();
            node.val = sum;
            temp.next =  node;
            temp = temp.next;
        }

        while(l1!=null){
            int sum = l1.val+ carry;
            if(sum >=10){
                sum = sum - 10;
                carry = 1;
            } else {
                carry = 0;
            }
            listnode node = new listnode();
            node.val = sum;
            temp.next =  node;
            temp = temp.next;
        }

        while(l2!=null){
            int sum = l2.val+carry;
            if(sum >=10){
                sum = sum - 10;
                carry = 1;
            } else {
                carry = 0;
            }
            listnode node = new listnode();
            node.val = sum;
            temp.next =  node;
            temp = temp.next;
        }
        if(carry>0){
            listnode node = new listnode();
            node.val = carry;
            temp.next =  node;
            temp = temp.next;
        }
        return list.next;
    }
}
