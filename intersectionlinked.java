import java.util.*;

public class intersectionlinked {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int sizeA = getsize(headA);
        int sizeB = getsize(headB);
        if(sizeB>sizeA){
            for(int i=0; i<sizeB-sizeA; i++){
                headB = headB.next;
            }
        }
        if(sizeA>sizeB){
            for(int i=0; i<sizeA-sizeB; i++){
                headA = headA.next;
            }
        }
        
        while(headA!=null && headB!=null){
            if(headA==headB){
                return headA;
            }
            headA= headA.next;
            headB= headB.next;
        }
        return null;
    }


    public int getsize(ListNode a){
        ListNode temp = a;
        int count =0;
        while(temp!=null){
            count = count +1;
            temp = temp.next;
        }
        return count;
    }
}
