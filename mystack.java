import java.util.*;

class MyStack {
    Queue<Integer> q;
    Queue<Integer> q1;

    public MyStack() {
        q = new LinkedList<Integer>();
        q1 = new LinkedList<Integer>();
    }
    
    public void push(int x) {
        q.add(x);
    }
    
    public int pop() {
        while(q.size()!=1){
            q1.add(q.poll());
        }
        int x= q.poll();
        while(!q1.isEmpty()){
            q.add(q1.poll());
        }
        return x;
    }
    
    public int top() {
        while(q.size()!=1){
            q1.add(q.poll());
        }
        int x= q.poll();
        while(!q1.isEmpty()){
            q.add(q1.poll());
        }
        q.add(x);
        return x;
        
    }
    
    public boolean empty() {
        return q.isEmpty();
    }
}