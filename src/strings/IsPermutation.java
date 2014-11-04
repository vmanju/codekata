package strings;

public class IsPermutation {
    
    private static boolean isPermutation(String s1, String s2){
    
        if(s1.length() != s2.length()) return false;
        
        int[] letters = new int[256];
        
        for(char c: s1.toCharArray()){
            letters[c]++;
        }
        
        for(int i=0; i<s2.length(); i++){
            char c = s2.charAt(i);
            if(--letters[c]<0) return false;
        }
        
        return true;
    }
    
    public static void main(String[] args){
        System.out.println(isPermutation("madam", "daamm"));
        System.out.println(isPermutation("", "abc"));
        System.out.println(isPermutation("", ""));
        System.out.println(isPermutation("abaaa", "abaaaa"));
    }
}