import java.util.*;

public class baseball {
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<ops.length; i++){
            if(ops[i].equals("C")==false || !ops[i].equals("D")|| !ops[i].equals("+")){
                stack.push(Integer.valueOf(ops[i]));
            } else if(ops[i].equals("C")){
                stack.pop();
            } else if(ops[i].equals("D")){
                stack.push(stack.peek()*2);
            } else{
                int temp = stack.pop();
                int add = stack.peek() + temp;
                stack.push(temp);
                stack.push(add);
            }
        }
        int ans = 0;
        for(int score : stack) ans += score;
        return ans;
    }
}