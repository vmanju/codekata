package interviewcake;

public class Parenthesis {
	private static int getClosingParen(String s){
		
		int open = 0;
		
		for(int i=0; i<s.length(); i++){
			if(s.charAt(i)=='(')
				open++;
			if(s.charAt(i)==')'){
				open--;
			}
			if(open==0) return i;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		System.out.println(getClosingParen("(this is(open and then closed))"));
		System.out.println(getClosingParen("(()))"));
	}

}
