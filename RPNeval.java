import java.util.*;

public class RPNeval {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();
        for(int i=0 ; i<tokens.length; i++){
            if(!tokens[i].equals("+") && !tokens[i].equals("-") && !tokens[i].equals("*") && !tokens[i].equals("/") ){
                s.push(Integer.valueOf(tokens[i]));
            }
            if(tokens[i].equals("+")){
                int x = s.pop();
                int y =s.pop();
                s.push(x+y);
            }
            if(tokens[i].equals("-")){
                int x = s.pop();
                int y =s.pop();
                s.push(y-x);
            }
            if(tokens[i].equals("*")){
                int x = s.pop();
                int y =s.pop();
                s.push(y*x);
            }
            if(tokens[i].equals("/")){
                int x = s.pop();
                int y =s.pop();
                s.push(y/x);
            }
        }
        return s.pop();
    }
}
