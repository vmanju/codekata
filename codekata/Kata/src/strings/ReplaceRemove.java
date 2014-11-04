package strings;

public class ReplaceRemove {

    private static String replaceRemove(String s) {
        int count = 0;
        int n = s.length();
        
        
        for(int i = 0; i<n; i++) {
            if(s.charAt(i)=='a') count++;
            else if(s.charAt(i)=='b') count--;
        }
        
        char[] s_arr = new char[n+count];
        for(int i=0; i<n; i++)
        	s_arr[i] = s.charAt(i);
        
        int i=n-1;
        for(int j = n + count - 1; j>=0 && i>=0; j--, i--){
            if(s_arr[i] == 'a') {
                s_arr[j] = 'd';
                s_arr[--j] = 'd';
            } 
            else if(s_arr[i] == 'b') 
            	s_arr[j] = ' ';
            else 
            	s_arr[j] = s_arr[i];     
        }
        
        return String.valueOf(s_arr);
    }
    
    public static void main(String[] args){
        System.out.println(replaceRemove("abbacaa"));
        String res = replaceRemove("abbacaa");
        assert(res.equals("ddddcdddd"));
    }
}
