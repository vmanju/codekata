package talentbuddy;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Set;

public class RPNEvaluator {

	public static int compute(int p, int q, String op) {
        
        if(op.equals("+")) return q+p;
        else if(op.equals("-")) return q-p;
        else if(op.equals("*")) return q*p;
        else return q/p;
            
    }
    
    public static String getToken(String s){
        int i = 0;
        StringBuilder sb = new StringBuilder();
        char c = s.charAt(i);
        
        if(c=='+' ||
           c=='-' ||
           c=='*' ||
           c=='/' ||
           c=='~'
          ) 
            sb.append(c);
        
        else if(Character.isDigit(c)) {
            while(Character.isDigit(c)){
                sb.append(c);
                c = s.charAt(++i);
            }
        } else {
        	sb.append(c);
        }
        
        return sb.toString();
    }
    
    public static void rpn_eval(String expr) {
        Deque<Integer> stack = new ArrayDeque<>();
        Set<String> operators = new HashSet<>();
        operators.add("+");
        operators.add("-");
        operators.add("*");
        operators.add("/");
        operators.add("~");
        
        
        while(expr.length()>0){
            
            String s = getToken(expr);
            expr = expr.substring(expr.indexOf(s)+s.length());
            
            // if string is an operand
            if(s.matches("\\d+")) 
                stack.push(Integer.valueOf(s));
            // if string is an operator
            else if(operators.contains(s)){
                if(s.equals("~"))
                    stack.push(-1 * stack.pop());
                else
                    stack.push(compute(stack.pop(), stack.pop(), s)); 
            }
        }
        
        System.out.println(stack.pop());
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rpn_eval("101 303 + 2/1~%%%1-+");
	}

}
