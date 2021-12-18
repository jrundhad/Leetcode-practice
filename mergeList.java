public class mergeList {
    public listnode mergeTwoLists(listnode list1, listnode list2) {
        listnode list = new listnode();
        listnode temp = list;
        while(list1!=null && list2!=null){
            if(list1.val<= list2.val){
                temp.next = list1;
                list1 = list1.next;
                temp = temp.next;

            } else{
                temp.next = list2;
                list2 = list2.next;
                temp = temp.next;
            }
        }

        while(list1!=null){
            temp.next = list1;
            list1 = list1.next;
            temp = temp.next;
        }

        while(list2!=null){
            temp.next = list2;
            list2 = list2.next;
            temp = temp.next;
        }
        
        list = list.next;
        return list;
    }
}
