package strings;

public class RLE {

    private static String encode(String s){
        char c = s.charAt(0);
        int count = 1;
        StringBuilder buff = new StringBuilder();
        
        for(int i=1; i<s.length(); i++){
            if(s.charAt(i) == s.charAt(i-1))
                count++;
            else {
                buff.append(count).append(c);
                count = 1;
                c = s.charAt(i);
            }
        }   
        buff.append(count).append(c);
        return buff.toString();
    }
    
    private static String decode(String s){
        StringBuilder buff = new StringBuilder();
        for(int i=0; i<s.length(); i+=2){
            for(int j=s.charAt(i)-'0'; j>0; j--)
                buff.append(s.charAt(i+1)); 
        }
        return buff.toString();
    }
    
    public static void main(String[] args){
        //System.out.println(encode("aaaabcccaa"));
        //System.out.println(decode("4a1b3c2a"));
    	assert("4a1b3c2a".equals(encode("aaaabcccaa")));
    	assert("aaaabcccaa".equals(decode("4a1b3c2a"))); 
    	
    }
}
