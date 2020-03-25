/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode result = new ListNode(0);
        ListNode l1val= l1, l2val = l2, eval = result;  
        while(l1val != null || l2val != null){
            int x, y;
            if(l1val!=null){
                x= l1val.val;
            }else{
                x=0;
            }
            if(l2val!=null){
                y= l2val.val;
            }else{
                y= 0;
            }
            int sum = x + y + carry;
            carry = sum / 10;
            eval.next = new ListNode(sum % 10);
            eval = eval.next;
            if(l1val != null)
                l1val =l1val.next;   
            if(l2val != null)
                l2val =l2val.next;
        }
        if(carry != 0 ){
            eval.next = new ListNode(carry);
        }
        return result.next;
        
    }
}
