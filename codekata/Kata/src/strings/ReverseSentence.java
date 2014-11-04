package strings;

import java.util.Random;

public class ReverseSentence {

	private static void swap(char[] s_arr, int i, int j){
		char temp = s_arr[i];
		s_arr[i] = s_arr[j];
		s_arr[j]= temp;
	}
	
	private static String reverseString(String s){
		char[] s_arr = s.toCharArray();
		for(int start=0, end=s.length()-1; start<=end; start++, end--)
			swap(s_arr, start, end);
		
		return String.valueOf(s_arr);
	}
	
	private static String reverseLine(String s){
		StringBuilder result = new StringBuilder();
		int start = 0, end = 0;
		for(; end<s.length(); end++){
			if(s.charAt(end)==' ') {
				result.append(reverseString(s.substring(start, end))).append(" ");
				start = end+1;
			}
		}
		result.append(reverseString(s.substring(start, end)));
		return String.valueOf(result);
			
	}
	
	private static String randString(int len){
		Random rand = new Random();
		StringBuilder ret = new StringBuilder();
		while(len-- > 0){
			int c = rand.nextInt(53);
			if(c == 52) ret.append(' ');
			else if(c < 26) ret.append(c + 'a');
			else ret.append(c - 26 + 'A');
		}
		
		return ret.toString();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Alice is Bob";
		//String reverse = reverseString(s);
		//System.out.println(reverse);
		//System.out.println(reverseLine(reverse));
		
		Random rand = new Random();
		s = randString(rand.nextInt(100));
		System.out.println(s);
		System.out.println(reverseLine(reverseString(s)));
		
	}

}
