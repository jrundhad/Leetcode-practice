public class listnode {
    int val;
    listnode next;
    listnode() {}
    listnode(int val) { this.val = val; }
    listnode(int val, listnode next) { this.val = val; this.next = next; }
}