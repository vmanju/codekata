package recursion;

public class Combination {

    private static void combine(String prefix, String s){      
        System.out.println(prefix);
        //if(s.length()==0) return;
        for(int i=0; i<s.length(); i++)
            combine(prefix+s.charAt(i), s.substring(i+1));
    }
    
    private static void combineK(String prefix, String s, int k){
    	if(k==0) System.out.println(prefix);
    	for(int i=0; i<s.length(); i++)
            combineK(prefix+s.charAt(i), s.substring(i+1), k-1);
    }
    
    
    
    
    public static void main(String[] args){
        combine("", "abc");
        combineK("", "abc", 2); 
    }

}
