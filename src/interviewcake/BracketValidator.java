package interviewcake;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;


public class BracketValidator {

	private static boolean bracketValidator(String s){
		Stack<Character> stack = new Stack<>();
		Map<Character, Character> map = new HashMap<>();
		map.put(')', '(');
		map.put(']', '[');
		map.put('}', '{');
		for(char c: s.toCharArray()){
			if(map.containsValue(c))
				stack.push(c);
			else if(map.containsKey(c)){
				if(stack.isEmpty()) return false;
				
				if(stack.peek()==map.get(c))
					stack.pop();
				else
					return false;
			}
		}
		
		return stack.isEmpty();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(bracketValidator("{ [ ] ( ) }"));
		System.out.println(bracketValidator("{ [ ( ] ) }"));
		System.out.println(bracketValidator("{ [ }"));
		System.out.println(bracketValidator("{}"));
	}

}
