import java.util.HashMap;

public class LRUCache {
    DListNode head;
    DListNode tail;
    int capacity;
    HashMap<Integer, DListNode> map;
    
    public LRUCache(int capacity) {
        this.capacity = capacity;
        head = new DListNode();
        tail = new DListNode();
        map = new HashMap<>();
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        if(!map.containsKey(key)){
            return -1;
        }
        DListNode node = map.get(key);
        delete(node);
        prepend(node);
        return node.val;
    }
    
    public void put(int key, int value) {
        DListNode node = map.get(key);
        if(node!= null){
            node.val= value;
            delete(node);
            prepend(node);
            return;
            //System.out.println(13412);
        }

        DListNode Newnode= new DListNode();
        Newnode.key = key;
        Newnode.val = value;

        if(map.size()<capacity){
            prepend(Newnode);
        } else{
            delete(tail.prev);
            prepend(Newnode);
        }
    }

    public void prepend(DListNode node){
        DListNode temp = head.next;
        head.next= node;
        node.prev=head;
        node.next = temp;
        temp.prev = node;
        map.put(node.key, node);
    }

    public void delete(DListNode node){
        DListNode prevNode = node.prev;
        DListNode nextNode = node.next;
        prevNode.next= nextNode;
        nextNode.prev = prevNode;
        map.remove(node.key);
    }
}
