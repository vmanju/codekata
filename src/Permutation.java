public class Permutation {
	
	private static void Permute(String prefix, String s){
	
		if(s.length()==0) System.out.println(prefix);
		
		for(int i=0; i<s.length(); i++){
			Permute(prefix + s.charAt(i), s.substring(0,i) + s.substring(i+1));
		}
		
	}
	
	private static void PermuteK(String prefix, String s, int k){
		if(k==0) System.out.println(prefix);
		
		for(int i=0; i<s.length(); i++){
			PermuteK(prefix + s.charAt(i), s.substring(0,i) + s.substring(i+1), k-1);
		}
		
	}
	
	public static void main(String[] args) {
		Permute("", "cats");
		PermuteK("", "cats", 2);
	}
}
