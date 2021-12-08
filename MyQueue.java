import java.util.*;

class MyQueue {
    private Stack<Integer> s; 
    private Stack<Integer> s2;

    public MyQueue() {
        s = new Stack<>();
        s2 = new Stack<>();
    }
    
    public void push(int x) {
        s.push(x);
    }
    
    public int pop() {
        while(!s.isEmpty()){
            s2.push(s.pop());
        }
        int x= s2.pop();
        while(!s2.isEmpty()){
            s.push(s2.pop());
        }
        return x;
    }
    
    public int peek() {
        while(!s.isEmpty()){
            s2.push(s.pop());
        }
        int x= s2.peek();
        while(!s2.isEmpty()){
            s.push(s2.pop());
        }
        return x;
    }
    
    public boolean empty() {
        return s.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */