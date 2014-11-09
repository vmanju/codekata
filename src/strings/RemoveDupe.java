package strings;

import java.util.Arrays;

public class RemoveDupe {

	private static String removeDupe(String s){
	    if(s.length()<=1) return s;
	    
	    boolean[] char_set = new boolean[256];
	    String res = "";
	    
	    for(int i=0; i<s.length(); i++){
	        char c = s.charAt(i);
	        if(!char_set[c-'a']){
	            res+=c;
	            char_set[c-'a']= true;
	        } 
	    }
	    
	    return res;

	}
	
	private static String removeDupe2(String s){
	    if(s.length()<=1) return s;
	    char[] s_arr = s.toCharArray();
	    Arrays.sort(s_arr);
	    StringBuffer res = new StringBuffer();
	    res.append(s_arr[0]);
	    
	    for(int i=1; i<s_arr.length; i++){
	        if(s_arr[i] != s_arr[i-1])
	            res.append(s_arr[i]);
	    }
	    
	    return res.toString();

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		assert(removeDupe("aaabcdcd").equals("abcd"));
		assert(removeDupe2("aaabcdcd").equals("abcd"));
	}

}
