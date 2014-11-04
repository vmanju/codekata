package strings;

public class StringSearch {

    private static int find(String t, String s) {
        for(int i=0; i<t.length(); i++){
        	int j = 0;
            for(; j<s.length(); j++)
                if(s.charAt(j) != t.charAt(i+j)) break;
            if(j==s.length()) return i;    
        }
        return -1;
    }
    
    private static int find2(String t, String s){
    	for(int i =0; i<t.length(); i++){
    		if(s.hashCode()==t.substring(i, i+s.length()).hashCode()) return i;
    	}
    	return -1;
    }
    
    public static void main(String[] args){
        System.out.println(find2("abacabaa", "aa"));
        //assert(find("abacabaa", "ba") == 1);
        //System.out.println("ba".hashCode());
    }
}
